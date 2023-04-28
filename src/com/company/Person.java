package com.company;

public abstract class Person {
    private String name;
    private int age;
    private String PhoneNO;
    private String Address;

    public Person(String name, int age, String phoneNO, String address) {
        this.name = name;
        this.age = age;
        PhoneNO = phoneNO;
        Address = address;
    }

    public String getPhoneNO() {
        return PhoneNO;
    }

    public void setPhoneNO(String phoneNO) {
        PhoneNO = phoneNO;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
