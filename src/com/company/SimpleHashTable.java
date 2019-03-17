package com.company;
/*
 * File Name: SimpleHashTable.java
 * Author: Evan Gertis
 * Date: 03/17/2019
 * Purpose: Class for generating an array based hash table for company employees.
 */
public class SimpleHashTable {

    //Hash table array.
    private Employee[] hashtable;

    public SimpleHashTable(){
        //set capacity to 10 by default.
        hashtable = new Employee[10];
    }

    //hashing function.
    private int hashKey(String key){
        return key.length() % hashtable.length;
    }
}
