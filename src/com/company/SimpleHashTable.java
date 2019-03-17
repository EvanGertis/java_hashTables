package com.company;

/*
 * File Name: SimpleHashTable.java
 * Author: Evan Gertis
 * Date: 03/17/2019
 * Purpose: Class for generating an array based hash table for company employees.
 */
public class SimpleHashTable {

    //Hash table array.
    private StoredEmployee[] hashtable;

    public SimpleHashTable(){
        //set capacity to 10 by default.
        this.hashtable = new StoredEmployee[10];
    }

    //put method, allows user to put stuff in the table.
    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);

        //if occupied then commence linear probing.
        if(occupied(hashedKey)){
            int stopIndex = hashedKey;
            if(hashedKey == hashtable.length -1){
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while(occupied(hashedKey) && hashedKey != stopIndex){
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if(occupied(hashedKey)){
            System.out.println("Sorry there is already an employee in this index");
        } else {
            this.hashtable[hashedKey] = new StoredEmployee(key, employee);
        }

    }

    //get from hashtable.
    public Employee get(String key){
        int hashedKey = findKey(key);
        if(hashedKey == -1){
            return null;
        }
        return this.hashtable[hashedKey].mEmployee;
    }

    //check if position is occupied.
    private boolean occupied(int index){
        return hashtable[index] != null;
    }

    private int findKey(String key){
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] != null && hashtable[hashedKey].mKey.equals(key)){
            return hashedKey;
        }
        int stopIndex = hashedKey;
        if(hashedKey == hashtable.length -1){
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while(hashedKey != stopIndex && hashtable[hashedKey] != null && !hashtable[hashedKey].mKey.equals(key)){
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if(stopIndex == hashedKey) {
            return -1;
        } else {
            return hashedKey;
        }
    }

    //hashing function.
    private int hashKey(String key){
        return key.length() % this.hashtable.length;
    }

    //print hashtable.
    public void printHashTable(){
        for(int i = 0; i < this.hashtable.length; i++){
            if(hashtable[i] == null){
                System.out.println("empty");
            } else {
                System.out.println("Position " + i + ": " + this.hashtable[i].mEmployee);
            }
        }
    }

}
