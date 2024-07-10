package java.ru.netology.spring_boot.controller.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.ru.netology.spring_boot.controller.systemprofile.DevProfile;
import java.ru.netology.spring_boot.controller.systemprofile.ProductionProfile;
import java.ru.netology.spring_boot.controller.systemprofile.SystemProfile;


@Configuration
public class JavaConfig {
    @Bean
    @ConditionalOnProperty(prefix = "netology.profile", name = "dev", havingValue = "true")
    public SystemProfile devProfile() {
        return (SystemProfile) new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(prefix = "netology.profile", name = "dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
