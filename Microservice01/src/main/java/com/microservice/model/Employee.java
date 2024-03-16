package com.microservice.model;


import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Employee {

    private int id;
    private String name;
    private String address;


}
