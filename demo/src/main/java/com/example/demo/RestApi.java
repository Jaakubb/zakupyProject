package com.example.demo;

import com.example.demo.products.ProductRepository;
import com.example.demo.products.Produkt;
import com.example.demo.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class RestApi {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public ResponseEntity<String> addProduct (@RequestBody Produkt produkt){

        productRepository.addProdukt(produkt);
        return ResponseEntity.ok().body("some data");
    }



}
