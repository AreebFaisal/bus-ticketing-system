package com.company;

public class BusStaff extends Staff {
   private int Busno;
   private String destination;

    public BusStaff(String name, int age, String phoneNO, String address, int staffid, String designation, int busno, String destination) {
        super(name, age,phoneNO, address, staffid, designation);
        Busno = busno;
        this.destination = destination;
    }

    public int getBusno() {
        return Busno;
    }

    public void setBusno(int busno) {
        Busno = busno;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
