package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Customer customer = new Customer(1, "Maxine Mützerich", "Mützenhausen");
       
        customer.initOrder();
        customer.checkOrder();
       
    }

}

