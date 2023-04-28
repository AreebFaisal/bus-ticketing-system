package com.company;

public class Customer extends Person {
    private int Customerid;

    public Customer(String name, int age, String phoneNO, String address, int customerid) {
        super(name, age, phoneNO, address);
        Customerid = customerid;
    }

    public void setCustomerid(int customerid) {
        Customerid = customerid;
    }

    public int getCustomerid() {
        return Customerid;
    }

}
