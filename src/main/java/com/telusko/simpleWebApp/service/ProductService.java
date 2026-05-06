package com.telusko.simpleWebApp.service;

import com.telusko.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
                  @Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(101, "phone", 90000), new Product(102, "laptop", 70000),new

    Product(103,"ipad",40000));

    public List<Product> getProducts() {
        return products;
    }
}
