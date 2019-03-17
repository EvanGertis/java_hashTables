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
        this.hashtable = new Employee[10];
    }

    //put method, allows user to put stuff in the table.
    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        if(this.hashtable[hashedKey] != null){
            System.out.println("Sorry there is already an employee in this index");
        } else {
            this.hashtable[hashedKey] = employee;
        }

    }

    //get from hashtable.
    public Employee get(String key){
        int hashedKey = hashKey(key);
        return this.hashtable[hashedKey];
    }

    //print hashtable.
    public void printHashTable(){
        for(int i = 0; i < this.hashtable.length; i++){
            System.out.println(this.hashtable[i]);
        }
    }

    //hashing function.
    private int hashKey(String key){
        return key.length() % this.hashtable.length;
    }
}
