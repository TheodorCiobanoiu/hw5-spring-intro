package com.theodorciobanoiuviorel.hw5springintro.dto;

import com.sun.istack.NotNull;
import com.theodorciobanoiuviorel.hw5springintro.Model.Customer;
import com.theodorciobanoiuviorel.hw5springintro.Model.OrderDetails;
import lombok.Data;

import javax.persistence.OneToOne;
import java.sql.Date;

@Data
public class OrdersDTO {
    private Date order_date;
    private Date shipped_date;
    private String status;
    private Customer customer;
    private OrderDetails orderDetails;
}
