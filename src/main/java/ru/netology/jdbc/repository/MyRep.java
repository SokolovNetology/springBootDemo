package ru.netology.jdbc.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.netology.jdbc.model.Customer;
import ru.netology.jdbc.model.Order;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.stream.Collectors;

@Repository
public class MyRep {
    private final String SQL_GET_PRODUCT_SCRIPT = "getProductNameScript.sql";
    private final String SQL_ADD_CUSTOMER_SCRIPT = "addCustomerScript.sql";
    private final String SQL_ADD_ORDER_SCRIPT = "addOrderScript.sql";

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public MyRep() {
    }

    // Добавление заказчика
    public Integer addCustomer(Customer customer) {
        var parametersMap = new HashMap<String, Object>();
        parametersMap.put("name", customer.getName());
        parametersMap.put("surname", customer.getSurname());
        parametersMap.put("age", customer.getAge());
        parametersMap.put("phone_number", customer.getAge());

        return namedParameterJdbcTemplate.execute(
                read(SQL_ADD_CUSTOMER_SCRIPT),
                parametersMap,
                PreparedStatement::executeUpdate
        );
    }

    // Добавление заказа
    public Integer addOrder(Order order) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        var parametersMap = new HashMap<String, Object>();
        parametersMap.put("date", order.getDate());
        parametersMap.put("customer_id", order.getCustomer_id());
        parametersMap.put("product_name", order.getProduct_name());
        parametersMap.put("amount", order.getAmount());

        return namedParameterJdbcTemplate.execute(
                read(SQL_ADD_ORDER_SCRIPT),
                parametersMap,
                PreparedStatement::executeUpdate
        );

    }


    // Получение списка продуктов по имени заказчика
    public String getProductName(String name) {
        String sqlGetProductNameScript = read(SQL_GET_PRODUCT_SCRIPT);
        var parametersMap = new HashMap<String, String>();
        parametersMap.put("name", name);

        var result = namedParameterJdbcTemplate.query(
                sqlGetProductNameScript,
                parametersMap,
                (rs, rowNum) -> rs.getString("product_name"));
        return result.toString();
    }


    // Метод считывания скрипта из файла
    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}