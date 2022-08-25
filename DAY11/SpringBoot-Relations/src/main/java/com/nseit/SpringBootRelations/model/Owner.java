package com.nseit.SpringBootRelations.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Owner {
    private int id;
    private String userName;
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
}
