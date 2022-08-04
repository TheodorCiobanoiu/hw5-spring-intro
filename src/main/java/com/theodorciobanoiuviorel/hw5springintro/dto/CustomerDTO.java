package com.theodorciobanoiuviorel.hw5springintro.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerDTO {
    private String username;
    private String last_name;
    private String first_name;
}
