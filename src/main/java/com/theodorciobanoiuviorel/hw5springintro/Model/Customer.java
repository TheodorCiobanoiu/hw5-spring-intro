package com.theodorciobanoiuviorel.hw5springintro.Model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;
    @NotNull
    private String username;
    @NotNull
    private String last_name;
    @NotNull
    private String first_name;
    @NotNull
    private String phone;
    @NotNull
    private String address;
    @NotNull
    private String city;
    @NotNull
    private String postal_code;
    @NotNull
    private  String country;
    @OneToMany
    @NotNull
    private List<Orders> orders;
    @OneToMany
    @NotNull
    private List<Payment> payments;
}
