package com.example.cloudparkingdio.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ParkingCreateDTO {

    private String license;
    private String state;
    private String model;
    private String color;
}