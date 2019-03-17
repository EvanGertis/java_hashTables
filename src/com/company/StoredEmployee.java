package com.company;
/*
 * File Name: StoredEmployee.java
 * Author: Evan Gertis
 * Date: 03/17/2019
 * Purpose: Class two store two things: the employee and their key.
 */
public class StoredEmployee {

    public String mKey;
    public Employee mEmployee;

    public StoredEmployee(String key, Employee employee){
        this.mEmployee = employee;
        this.mKey = key;
    }
}
