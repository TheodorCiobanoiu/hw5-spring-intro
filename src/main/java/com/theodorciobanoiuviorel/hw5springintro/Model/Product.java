package com.theodorciobanoiuviorel.hw5springintro.Model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue
    private Integer id;
    @NotNull
    private String name;
    private String description;
    @NotNull
    private int stock;
    @NotNull
    private Double price;
}
