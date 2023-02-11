package com.example.demo.products;

import com.example.demo.users.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class ProductRowMapper implements RowMapper<Produkt> {

    @Override
    public Produkt mapRow(ResultSet rs, int rowNum) throws SQLException {
        Produkt produkt = new Produkt();

        produkt.setId_p(rs.getInt("id_p"));
        produkt.setName(rs.getString("name"));
        produkt.setPrice(rs.getInt("price"));

        return produkt;
    }
}
