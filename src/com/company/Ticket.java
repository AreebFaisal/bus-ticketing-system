package com.company;

public class Ticket extends Customer {
      private String Source,Destination,Date;
      private String time;
      private int busno,seatno;
      private int PayableAmount;

    public Ticket(String name, int age, String phoneNO, String address, int customerid, String source, String destination, String date, String time, int busno, int seatno, int payableAmount) {
        super(name, age, phoneNO, address, customerid);
        Source = source;
        Destination = destination;
        Date = date;
        this.time = time;
        this.busno = busno;
        this.seatno = seatno;
        PayableAmount = payableAmount;
    }

    public int getPayableAmount() {
        return PayableAmount;
    }

    public void setPayableAmount(int payableAmount) {
        PayableAmount = payableAmount;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getBusno() {
        return busno;
    }

    public void setBusno(int busno) {
        this.busno = busno;
    }

    public int getSeatno() {
        return seatno;
    }

    public void setSeatno(int seatno) {
        this.seatno = seatno;
    }
    public void PrintTicket(){
        System.out.println("             Ticket");
        System.out.println("Customer Name:"+getName());
        System.out.println("Customer Age:"+getAge());
        System.out.println("Customer Address:"+getAddress());
        System.out.println("Customer Contact Number :"+getPhoneNO());
        System.out.println("Customer ID:"+getCustomerid());
        System.out.println("Travel Date:"+getDate());
        System.out.println("Bus Departure Time:"+getTime());
        System.out.println("Destination:"+getDestination());
        System.out.println("Bus Number:"+getBusno());
        System.out.println("Seat Number:"+getSeatno());

    }
}
