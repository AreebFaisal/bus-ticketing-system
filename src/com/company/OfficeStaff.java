package com.company;

public class OfficeStaff extends Staff {
    private String username, password;

    public OfficeStaff(String name, int age, String phoneNO, String address, int staffid, String designation, String username, String password) {
        super(name, age, phoneNO, address, staffid, designation);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
