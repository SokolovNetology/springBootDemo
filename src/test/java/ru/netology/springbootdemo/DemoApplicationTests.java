package ru.netology.springbootdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.testcontainers.containers.GenericContainer;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {
    private static GenericContainer<?> devApp = new GenericContainer<>("devapp:1.0").
            withExposedPorts(8080);
    private static GenericContainer<?> prodApp = new GenericContainer<>("prodapp:1.0").
            withExposedPorts(8081);

    @Autowired
    TestRestTemplate restTemplate;

    @BeforeAll
    public static void setUp() {
        devApp.start();
        prodApp.start();
    }

    @Test
    void contextLoadsForProd() {
        ResponseEntity<String> forEntity = restTemplate.getForEntity(
                "http://localhost:" +
                        prodApp.getMappedPort(8081) + "/profile", String.class
        );
        String isValid = "Current profile is production";
        Assertions.assertEquals(forEntity.getBody(),isValid);
    }

    @Test
    void contextLoadsForDev() {
        ResponseEntity<String> forEntity = restTemplate.getForEntity(
                "http://localhost:" +
                        devApp.getMappedPort(8080) + "/profile", String.class
        );
        String isValid = "Current profile is dev";
        Assertions.assertEquals(forEntity.getBody(),isValid);
    }

}