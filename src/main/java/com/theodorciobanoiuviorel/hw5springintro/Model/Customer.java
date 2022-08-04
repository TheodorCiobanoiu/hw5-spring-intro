package com.theodorciobanoiuviorel.hw5springintro.Model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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
    private List<Orders> orders;
    @OneToMany
    private List<Payment> payments;
}
