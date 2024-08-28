package com.uade.tpo.cars_e_commerce.entity.dto;

import lombok.Data;

@Data
public class UserRequest {
    private int id;
    private String username;
    private String password;
    private String email;
    private String name;
    private String surname;
    private String home_address;
    private String phone_number;
}