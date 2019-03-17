package com.company;
/*
* File Name: Employee.java
* Author: Evan Gertis
* Date: 03/17/2019
* Purpose: Class for storing methods and memebers for implementing and Employee hash table.
*/

public class Employee {

    //private class memebers
    private String mFirstName;
    private String mLastName;
    private int mId;
    //**********************

    //Constructor initializes memebers.
    public Employee(String firstName, String lastName, int id){
        this.mFirstName = firstName;
        this.mLastName = lastName;
        this.mId = id;
    }
    //********************************

    //BEGIN CLASS METHODS

    //**GETTERS**//
    public String getFirstName() {
        return this.mFirstName;
    }

    public String getLastName() {
        return this.mLastName;
    }

    public int getId () {
        return this.mId;
    }
    //**********//

    //**SETTERS**//
    public void setFirstName(String firstName){
        this.mFirstName = firstName;
    }

    public void setLastName(String lastName){
        this.mLastName = lastName;
    }

    public void setId(int id){
        this.mId = id;
    }
    //***********//


    //END CLASS METHODS
}
