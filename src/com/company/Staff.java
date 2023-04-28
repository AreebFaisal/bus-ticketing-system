package com.company;

public abstract class Staff extends Person {
    private int Staffid;
    private String Designation;

    public Staff(String name, int age, String phoneNO, String address, int staffid, String designation) {
        super(name, age, phoneNO, address);
        Staffid = staffid;
        Designation = designation;
    }

    public int getStaffid() {
        return Staffid;
    }

    public void setStaffid(int staffid) {
        Staffid = staffid;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }
}
