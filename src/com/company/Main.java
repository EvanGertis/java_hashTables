package com.company;

public class Main {

    public static void main(String[] args) {
	//hashtable test code.
        Employee evanGertis = new Employee("Evan", "Gertis", 42);
        Employee postMalone = new Employee("Austin","Prescott", 22);
        Employee royWilliams = new Employee("Roy", "Williams", 64);

        SimpleHashTable hashTable = new SimpleHashTable();

        hashTable.put("Gertis", evanGertis);
        hashTable.put("Prescott", postMalone);
        hashTable.put("Williams", royWilliams);
        hashTable.printHashTable();

        System.out.println("Retrieve Gertis: " + hashTable.get("Gertis").getFirstName());

    }
}
