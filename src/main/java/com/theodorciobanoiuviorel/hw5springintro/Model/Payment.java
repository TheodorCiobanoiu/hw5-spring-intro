package com.theodorciobanoiuviorel.hw5springintro.Model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Date;

@Entity
@Data
public class Payment {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    @NotNull
    private Customer customer;
    @NotNull
    private Date payment_date;
    @NotNull
    private Double amount;
}
