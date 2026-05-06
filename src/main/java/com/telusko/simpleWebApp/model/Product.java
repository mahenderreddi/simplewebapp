package com.telusko.simpleWebApp.model;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Product {
   public Product() {

   }

   public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    private int id;
    private String name;
    private int price;


}
