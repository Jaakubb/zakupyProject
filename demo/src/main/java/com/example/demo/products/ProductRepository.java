package com.example.demo.products;

import com.example.demo.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {
    @Autowired
    private DataSource dataSource;

    public int addProdukt(Produkt emp) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("id_p", emp.getId_p());
        parameters.put("name", emp.getName());
        parameters.put("price", emp.getPrice());

        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(dataSource)
                .withTableName("produkt")
                .usingGeneratedKeyColumns("id_p");

        return simpleJdbcInsert.executeAndReturnKey(parameters).intValue();
    }
}
