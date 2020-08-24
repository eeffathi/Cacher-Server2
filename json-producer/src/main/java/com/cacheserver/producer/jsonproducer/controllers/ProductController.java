package com.cacheserver.producer.jsonproducer.controllers;

import com.cacheserver.producer.jsonproducer.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    private static List<Product> productList = new ArrayList<>();
    static {
        for (int i=0 ; i<10 ; i++) {
            Product product = new Product();
            product.setTitle("product " + i);
            productList.add(product);
        }
    }

//    @RequestMapping("/products")
    @GetMapping
    @ResponseBody
    public List<Product> getAllProducts(){
        return productList;
    }

}
