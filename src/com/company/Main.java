package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OfficeStaff s[]=new OfficeStaff[20];
        s[0]=new OfficeStaff("Areeb",20,"0306-2748474","Bahadurabad,Karachi",0011,"Sales Manager","areeb","123");
        s[1]=new OfficeStaff("Ali",20,"0302-2343174","Clifton,Karachi",0012,"Sales Agent","ali","asd123");
        s[2]=new OfficeStaff("Ahsan",20,"0306-28976162","Saddar,Karachi",0013,"Sales Agent","ahsan","asd786");
        s[3]=new OfficeStaff("Sameer",20,"0300-1233411","Garden West,Karachi",0014,"Sales Agent","sameer","goodguy");
        Ticket t[] = new Ticket[100];
        Customer c[] = new Customer[100];
        c[1]=new Customer("Umer",19,"0303-2342123","DHA,Karachi",1122);
        c[2]=new Customer("Asif",18,"0321-2312313","Karimabad,Karachi",1123);
        int available[] = new int[5];
        String places[] = new String[5];
        String time[] = new String[5];
        int sold[] = new int[5];
        int adultrate[] = new int[5];
        int childrate[] = new int[5];
        int i,a, id=0, choice, searchid, j, adults, child, cusid, amount, age, busnum, seat, option = 0, needed,paid=0;
        String user="areeb", pass="123", ans, name, address, date, number,destination;
        char answer;
        places[0] = "Hyderabad";
        places[1] = "Sukkur";
        places[2] = "Rohri";
        places[3] = "Lahore";
        places[4] = "Islamabad";
        time[0] = "12:00 am";
        time[1] = "2:00 pm";
        time[2] = "4:00 pm";
        time[3] = "6:00 pm";
        time[4] = "10:00 pm";
        available[0] = 20;
        available[1] = 12;
        available[2] = 3;
        available[3] = 7;
        available[4] = 10;
        adultrate[0]=4000;
        adultrate[1]=6000;
        adultrate[2]=7000;
        adultrate[3]=10000;
        adultrate[4]=12000;
        childrate[0]=3000;
        childrate[1]=5000;
        childrate[2]=6000;
        childrate[3]=9000;
        childrate[4]=11000;
        System.out.println("Please Staff ID:");
        Scanner sc = new Scanner(System.in);
       id = sc.nextInt();
        for (a=0;a<s.length;a++){
            if (id==s[a].getStaffid()){
                System.out.println("Please Enter Username:");
                user=sc.nextLine();
                if (user.equals(s[a].getUsername())){
                    System.out.println("Please Enter Password:");
                    pass = sc.nextLine();
                    if (pass==s[a].getPassword()){
                        System.out.println("\t \t \t \t Welcome "+s[a].getName());
                        System.out.println("\n");
                    }
                    else{
                        System.out.println("Wrong Password");
                    }
                }
                else {
                    System.out.println("Wrong Username");
                }

            }
        }


            System.out.println("Wrong Staff ID");

        System.out.println("                                        Menu");
        System.out.println("#########################################################################################");
        System.out.println("########### 1) BOOK TICKET                                          #####################");
        System.out.println("########### 2) SEARCH TICKET                                        #####################");
        System.out.println("########### 3) CANCEL TICKET                                        #####################");
        System.out.println("########### 4) MAKE PAYMENT                                         #####################");
        System.out.println("########### 5) EXIT                                                 #####################");
        System.out.println("#########################################################################################");
        System.out.println("\n");
        System.out.println("Please Select Option");
        choice = sc.nextInt();
       try{

           if (choice == 1) {
               System.out.println("                       Book Ticket");
               System.out.println("  Destination      Time     AdultRate   ChildRate");
               System.out.println("1)" +"Hyderabad      " + time[0]+ "    " + adultrate[0]+"      "   + childrate[0]);
               System.out.println("2)" +"Sukkur         " + time[1]+ "     " + adultrate[1]+"      "   + childrate[1]);
               System.out.println("3)" +"Rohri          " + time[2]+ "     " + adultrate[2]+"      "   + childrate[2]);
               System.out.println("4)" +"Lahore         " + time[3]+ "     " + adultrate[3]+"     "   + childrate[3]);
               System.out.println("5)" +"Islamabad      " + time[4]+ "    " + adultrate[4]+"     "   + childrate[4]);
               System.out.println("6) Exit");
               System.out.println("Please Select Option");
               try{
               option = sc.nextInt();
               if (option == 1) {
                   try{System.out.println("How many tickets needed?");
                   needed = sc.nextInt();
               }catch (InputMismatchException az){
                   Scanner a19=new Scanner(System.in);
                   System.out.println("Invalid Input Please enter again");
                   needed=a19.nextInt();}

                   try{System.out.println("How many adults?");
                       adults = sc.nextInt();
                   }catch (InputMismatchException as){
                       Scanner a20=new Scanner(System.in);
                       System.out.println("Invalid Input Please enter again");
                       adults=a20.nextInt();
                   }
                   try{System.out.println("How many children?");
                       child = sc.nextInt();}catch (InputMismatchException ae){
                       Scanner a21=new Scanner(System.in);
                       System.out.println("Invalid Input Please enter again");
                       child=a21.nextInt();
                   }
                   amount = (adults * adultrate[0]) + (childrate[0] * child);
                   if (available[0] >= needed) {
                       available[0] = available[0] - needed;
                       busnum = (int) ((Math.random() * ((100 - 1) + 1)) + 1);
                       for (i = 1; i <= needed; i++) {
                           try {
                               System.out.println("Enter Passenger Name");
                               name = sc.next();
                           }catch (InputMismatchException m) {
                               System.out.println("Invalid Input Please enter again");
                               Scanner a22=new Scanner(System.in);
                               name=a22.next();
                           }
                           try{
                               System.out.println("Enter Passenger Age");
                               age = sc.nextInt();
                           }catch (InputMismatchException ab){
                               Scanner a23=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               age=a23.nextInt();
                           }
                           try{System.out.println("Enter Passenger Contact Number");
                               number = sc.next();
                           }catch (InputMismatchException cc ){
                               Scanner a24=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               number=a24.next();
                           }
                           try{System.out.println("Enter Passenger Address");
                               address = sc.next();}catch(InputMismatchException d){
                               Scanner a25=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               address=a25.next();
                           }
                           try{System.out.println("Enter Travel Date");
                               date = sc.next();}catch (InputMismatchException de){
                               Scanner a26=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               date=a26.next();
                           }
                           cusid = (int) ((Math.random() * ((100 - 1) + 1)) + 1);
                           seat = (int) ((Math.random() * ((30 - 1) + 1)) + 1);
                           c[sold[0] + i] = new Customer(name, age, number, address, cusid);
                           t[sold[0] + i] = new Ticket(name, age, number, address, cusid, "Karachi", places[0], date, time[0], busnum, seat, amount);
                           System.out.println("Process Successful.Please Pay " + amount + " to get Tickets");

                           try{System.out.println("Enter Paid Amount");
                               paid=sc.nextInt();}catch (InputMismatchException xc){
                               Scanner a27=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               amount=a27.nextInt();
                           }
                           if (t[i].getPayableAmount()<=paid){
                               t[sold[0] + i].PrintTicket();
                           }
                       }
                       sold[0] = sold[0] + needed;
                   } else {
                       System.out.println("Sorry there are no tickets available");
                   }
               } else if (option == 2) {
                   try{System.out.println("How many tickets needed?");
                   needed = sc.nextInt();
                   }catch (InputMismatchException az){
                   Scanner a5=new Scanner(System.in);
                   System.out.println("Invalid Input Please enter again");
                   needed=a5.nextInt();}

                   try{System.out.println("How many adults?");
                   adults = sc.nextInt();
                   }catch (InputMismatchException as){
                       Scanner a6=new Scanner(System.in);
                       System.out.println("Invalid Input Please enter again");
                       adults=a6.nextInt();
                   }
                   try{System.out.println("How many children?");
                   child = sc.nextInt();}catch (InputMismatchException ae){
                       Scanner a7=new Scanner(System.in);
                       System.out.println("Invalid Input Please enter again");
                       child=a7.nextInt();
                   }
                   amount = (adults * adultrate[1]) + (childrate[1] * child);
                   if (available[1] >= needed) {
                       available[1] = available[1] - needed;
                       busnum = (int) ((Math.random() * ((100 - 1) + 1)) + 1);
                       for (i = 1; i <= needed; i++) {
                          try {
                              System.out.println("Enter Passenger Name");
                              name = sc.next();
                          }catch (InputMismatchException m) {
                              System.out.println("Invalid Input Please enter again");
                              Scanner w=new Scanner(System.in);
                               name=w.next();
                          }
                           try{
                              System.out.println("Enter Passenger Age");
                              age = sc.nextInt();
                           }catch (InputMismatchException ab){
                               Scanner ac=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               age=ac.nextInt();
                           }
                              try{System.out.println("Enter Passenger Contact Number");
                              number = sc.next();
                              }catch (InputMismatchException cc ){
                                  Scanner a1=new Scanner(System.in);
                                  System.out.println("Invalid Input Please enter again");
                                  number=a1.next();
                              }
                              try{System.out.println("Enter Passenger Address");
                              address = sc.next();}catch(InputMismatchException d){
                                  Scanner a2=new Scanner(System.in);
                                  System.out.println("Invalid Input Please enter again");
                                  address=a2.next();
                              }
                              try{System.out.println("Enter Travel Date");
                              date = sc.next();}catch (InputMismatchException de){
                                  Scanner a3=new Scanner(System.in);
                                  System.out.println("Invalid Input Please enter again");
                                  date=a3.next();
                              }
                           cusid = (int) ((Math.random() * ((100 - 1) + 1)) + 1);
                           seat = (int) ((Math.random() * ((30 - 1) + 1)) + 1);
                           c[sold[1] + i] = new Customer(name, age, number, address, cusid);
                           t[sold[1] + i] = new Ticket(name, age, number, address, cusid, "Karachi", places[1], date, time[1], busnum, seat, amount);
                           System.out.println("Process Successful.Please Pay " + amount + " to get Tickets");

                           try{System.out.println("Enter Paid Amount");
                           paid=sc.nextInt();}catch (InputMismatchException xc){
                               Scanner a4=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               amount=a4.nextInt();
                           }
                           if (t[i].getPayableAmount()<=paid){
                               t[sold[1] + i].PrintTicket();
                           }
                       }
                       sold[1] += needed;
                   } else {
                       System.out.println("Sorry there are no tickets available");
                   }

               } else if (option == 3) {
                   try{System.out.println("How many tickets needed?");
                       needed = sc.nextInt();
                   }catch (InputMismatchException az){
                       Scanner a9=new Scanner(System.in);
                       System.out.println("Invalid Input Please enter again");
                       needed=a9.nextInt();}

                   try{System.out.println("How many adults?");
                       adults = sc.nextInt();
                   }catch (InputMismatchException as){
                       Scanner a10=new Scanner(System.in);
                       System.out.println("Invalid Input Please enter again");
                       adults=a10.nextInt();
                   }
                   try{System.out.println("How many children?");
                       child = sc.nextInt();}catch (InputMismatchException ae){
                       Scanner a11=new Scanner(System.in);
                       System.out.println("Invalid Input Please enter again");
                       child=a11.nextInt();
                   }
                   amount = (adults * adultrate[2]) + (childrate[2] * child);
                   if (available[2] >= needed) {
                       available[2] = available[2] - needed;
                       busnum = (int) ((Math.random() * ((100 - 1) + 1)) + 1);
                       for (i = 1; i <= needed; i++) {
                           try {
                               System.out.println("Enter Passenger Name");
                               name = sc.next();
                           }catch (InputMismatchException m) {
                               System.out.println("Invalid Input Please enter again");
                               Scanner a12=new Scanner(System.in);
                               name=a12.next();
                           }
                           try{
                               System.out.println("Enter Passenger Age");
                               age = sc.nextInt();
                           }catch (InputMismatchException ab){
                               Scanner a13=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               age=a13.nextInt();
                           }
                           try{System.out.println("Enter Passenger Contact Number");
                               number = sc.next();
                           }catch (InputMismatchException cc ){
                               Scanner a14=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               number=a14.next();
                           }
                           try{System.out.println("Enter Passenger Address");
                               address = sc.next();}catch(InputMismatchException d){
                               Scanner a15=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               address=a15.next();
                           }
                           try{System.out.println("Enter Travel Date");
                               date = sc.next();}catch (InputMismatchException de){
                               Scanner a16=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               date=a16.next();
                           }
                           cusid = (int) ((Math.random() * ((100 - 1) + 1)) + 1);
                           seat = (int) ((Math.random() * ((30 - 1) + 1)) + 1);
                           c[sold[2] + i] = new Customer(name, age, number, address, cusid);
                           t[sold[2] + i] = new Ticket(name, age, number, address, cusid, "Karachi", places[2], date, time[2], busnum, seat, amount);
                           System.out.println("Process Successful.Please Pay " + amount + " to get Tickets");

                           try{System.out.println("Enter Paid Amount");
                               paid=sc.nextInt();}catch (InputMismatchException xc){
                               Scanner a17=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               amount=a17.nextInt();
                           }
                           if (t[i].getPayableAmount()<=paid){
                               t[sold[2] + i].PrintTicket();
                           }
                       }
                       sold[2] = sold[2] + needed;
                   } else {
                       System.out.println("Sorry there are no tickets available");
                   }

               } else if (option == 4) {
                   try{System.out.println("How many tickets needed?");
                       needed = sc.nextInt();
                   }catch (InputMismatchException az){
                       Scanner a28=new Scanner(System.in);
                       System.out.println("Invalid Input Please enter again");
                       needed=a28.nextInt();}

                   try{System.out.println("How many adults?");
                       adults = sc.nextInt();
                   }catch (InputMismatchException as){
                       Scanner a29=new Scanner(System.in);
                       System.out.println("Invalid Input Please enter again");
                       adults=a29.nextInt();
                   }
                   try{System.out.println("How many children?");
                       child = sc.nextInt();}catch (InputMismatchException ae){
                       Scanner a30=new Scanner(System.in);
                       System.out.println("Invalid Input Please enter again");
                       child=a30.nextInt();
                   }
                   amount = (adults * adultrate[3]) + (childrate[3] * child);
                   if (available[3] >= needed) {
                       available[3] = available[3] - needed;
                       busnum = (int) ((Math.random() * ((100 - 1) + 1)) + 1);
                       for (i = 1; i <= needed; i++) {
                           try {
                               System.out.println("Enter Passenger Name");
                               name = sc.next();
                           }catch (InputMismatchException m) {
                               System.out.println("Invalid Input Please enter again");
                               Scanner a31=new Scanner(System.in);
                               name=a31.next();
                           }
                           try{
                               System.out.println("Enter Passenger Age");
                               age = sc.nextInt();
                           }catch (InputMismatchException ab){
                               Scanner a32=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               age=a32.nextInt();
                           }
                           try{System.out.println("Enter Passenger Contact Number");
                               number = sc.next();
                           }catch (InputMismatchException cc ){
                               Scanner a33=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               number=a33.next();
                           }
                           try{System.out.println("Enter Passenger Address");
                               address = sc.next();}catch(InputMismatchException d){
                               Scanner a34=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               address=a34.next();
                           }
                           try{System.out.println("Enter Travel Date");
                               date = sc.next();}catch (InputMismatchException de){
                               Scanner a35=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               date=a35.next();
                           }
                           cusid = (int) ((Math.random() * ((100 - 1) + 1)) + 1);
                           seat = (int) ((Math.random() * ((30 - 1) + 1)) + 1);
                           c[sold[3] + i] = new Customer(name, age, number, address, cusid);
                           t[sold[3] + i] = new Ticket(name, age, number, address, cusid, "Karachi", places[3], date, time[3], busnum, seat, amount);
                           System.out.println("Process Successful.Please Pay " + amount + " to get Tickets");

                           try{System.out.println("Enter Paid Amount");
                               paid=sc.nextInt();}catch (InputMismatchException xc){
                               Scanner a36=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               amount=a36.nextInt();
                           }
                           if (t[i].getPayableAmount()<=paid){
                               t[sold[3] + i].PrintTicket();
                           }
                       }
                       sold[3] = sold[3] + needed;
                   } else {
                       System.out.println("Sorry there are no tickets available");
                   }

               } else if (option == 5) {
                   try{System.out.println("How many tickets needed?");
                       needed = sc.nextInt();
                   }catch (InputMismatchException az){
                       Scanner a37=new Scanner(System.in);
                       System.out.println("Invalid Input Please enter again");
                       needed=a37.nextInt();}

                   try{System.out.println("How many adults?");
                       adults = sc.nextInt();
                   }catch (InputMismatchException as){
                       Scanner a38=new Scanner(System.in);
                       System.out.println("Invalid Input Please enter again");
                       adults=a38.nextInt();
                   }
                   try{System.out.println("How many children?");
                       child = sc.nextInt();}catch (InputMismatchException ae){
                       Scanner a39=new Scanner(System.in);
                       System.out.println("Invalid Input Please enter again");
                       child=a39.nextInt();
                   }
                   amount = (adults * adultrate[4]) + (childrate[4] * child);
                   if (available[4] >= needed) {
                       available[4] = available[4] - needed;
                       busnum = (int) ((Math.random() * ((100 - 1) + 1)) + 1);
                       for (i = 1; i <= needed; i++) {
                           try {
                               System.out.println("Enter Passenger Name");
                               name = sc.next();
                           }catch (InputMismatchException m) {
                               System.out.println("Invalid Input Please enter again");
                               Scanner a40=new Scanner(System.in);
                               name=a40.next();
                           }
                           try{
                               System.out.println("Enter Passenger Age");
                               age = sc.nextInt();
                           }catch (InputMismatchException ab){
                               Scanner a41=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               age=a41.nextInt();
                           }
                           try{System.out.println("Enter Passenger Contact Number");
                               number = sc.next();
                           }catch (InputMismatchException cc ){
                               Scanner a42=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               number=a42.next();
                           }
                           try{System.out.println("Enter Passenger Address");
                               address = sc.next();}catch(InputMismatchException d){
                               Scanner a43=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               address=a43.next();
                           }
                           try{System.out.println("Enter Travel Date");
                               date = sc.next();}catch (InputMismatchException de){
                               Scanner a44=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               date=a44.next();
                           }
                           cusid = (int) ((Math.random() * ((100 - 1) + 1)) + 1);
                           seat = (int) ((Math.random() * ((30 - 1) + 1)) + 1);
                           c[sold[4] + i] = new Customer(name, age, number, address, cusid);
                           t[sold[4] + i] = new Ticket(name, age, number, address, cusid, "Karachi", places[4], date, time[4], busnum, seat, amount);
                           System.out.println("Process Successful.Please Pay " + amount + " to get Tickets");

                           try{System.out.println("Enter Paid Amount");
                               paid=sc.nextInt();}catch (InputMismatchException xc){
                               Scanner a45=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               amount=a45.nextInt();
                           }
                           if (t[i].getPayableAmount()<=paid){
                               t[sold[4] + i].PrintTicket();
                           }
                       }
                       sold[4] = sold[4] + needed;
                   } else {
                       System.out.println("Sorry there are no tickets available");}

               } else {
                   System.exit(0);
               }}catch (InputMismatchException z){
                   System.out.println("Invalid Input Please enter again");
                   Scanner abc=new Scanner(System.in);
                   option=abc.nextInt();
               }}
            else if (choice == 2) {
               try{
                System.out.println("Enter Customer ID ");
               searchid = sc.nextInt();
               }catch (InputMismatchException are){
                   Scanner a46=new Scanner(System.in);
                   System.out.println("Invalid Input Please enter again");
                   searchid=a46.nextInt();
               }
               try{
                   System.out.println("Enter Destination ");
                   destination = sc.next();
               }catch (InputMismatchException arem){
                   Scanner a56=new Scanner(System.in);
                   System.out.println("Invalid Input Please enter again");
                   destination=a56.next();
               }
               if (destination.equals("Hyderabad")){
               for (j = 0; j <= sold[0]; j++) {
                   if (searchid == c[j].getCustomerid()) {
                       System.out.println("Found at " + j + 1);
                       System.out.println("Customer name:" + c[j].getName());
                       System.out.println("Customer PhoneNo:" + c[j].getPhoneNO());
                       System.out.println("Customer Age:" + c[j].getAge());
                       System.out.println("Customer Address:" + c[j].getAddress());
                       System.out.println("Customer Travelling Date:" + t[j].getDate());
                       System.out.println("Customer Destination:" + t[j].getDestination());
                       System.out.println("Customer Bus Time:" + t[j].getTime());
                       System.out.println("Customer Bus Number:" + t[j].getBusno());
                       System.out.println("Customer Seat Number:" + t[j].getSeatno());
                       System.out.println("Customer Payable Amount:" + t[j].getPayableAmount());
                       try{
                       System.out.println("Do you want to print ticket?[Y/N]");
                       answer = sc.next().charAt(0);
                       }catch (InputMismatchException am){
                           Scanner a47=new Scanner(System.in);
                           System.out.println("Invalid Input Please enter again");
                           answer=a47.next().charAt(0);
                       }
                       if ((answer == 'Y') || (answer == 'y')) {
                           t[j].PrintTicket();
                       }
                       else{
                           System.exit(0);
                       }

                   } else {
                       System.out.println("Not Found");
                   }
               }}
               else if (destination.equals("Sukkur")){
                   for (j = 0; j <= sold[1]; j++) {
                       if (searchid == c[j].getCustomerid()) {
                           System.out.println("Found at " + j + 1);
                           System.out.println("Customer name:" + c[j].getName());
                           System.out.println("Customer PhoneNo:" + c[j].getPhoneNO());
                           System.out.println("Customer Age:" + c[j].getAge());
                           System.out.println("Customer Address:" + c[j].getAddress());
                           System.out.println("Customer Travelling Date:" + t[j].getDate());
                           System.out.println("Customer Destination:" + t[j].getDestination());
                           System.out.println("Customer Bus Time:" + t[j].getTime());
                           System.out.println("Customer Bus Number:" + t[j].getBusno());
                           System.out.println("Customer Seat Number:" + t[j].getSeatno());
                           System.out.println("Customer Payable Amount:" + t[j].getPayableAmount());
                           try{
                               System.out.println("Do you want to print ticket?[Y/N]");
                               answer = sc.next().charAt(0);
                           }catch (InputMismatchException am){
                               Scanner a47=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               answer=a47.next().charAt(0);
                           }
                           if ((answer == 'Y') || (answer == 'y')) {
                               t[j].PrintTicket();
                           }
                           else{
                               System.exit(0);
                           }

                       } else {
                           System.out.println("Not Found");
                       }
                   }}
               else if (destination.equals("Rohri")){
                   for (j = 0; j <= sold[2]; j++) {
                       if (searchid == c[j].getCustomerid()) {
                           System.out.println("Found at " + j + 1);
                           System.out.println("Customer name:" + c[j].getName());
                           System.out.println("Customer PhoneNo:" + c[j].getPhoneNO());
                           System.out.println("Customer Age:" + c[j].getAge());
                           System.out.println("Customer Address:" + c[j].getAddress());
                           System.out.println("Customer Travelling Date:" + t[j].getDate());
                           System.out.println("Customer Destination:" + t[j].getDestination());
                           System.out.println("Customer Bus Time:" + t[j].getTime());
                           System.out.println("Customer Bus Number:" + t[j].getBusno());
                           System.out.println("Customer Seat Number:" + t[j].getSeatno());
                           System.out.println("Customer Payable Amount:" + t[j].getPayableAmount());
                           try{
                               System.out.println("Do you want to print ticket?[Y/N]");
                               answer = sc.next().charAt(0);
                           }catch (InputMismatchException am){
                               Scanner a47=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               answer=a47.next().charAt(0);
                           }
                           if ((answer == 'Y') || (answer == 'y')) {
                               t[j].PrintTicket();
                           }
                           else{
                               System.exit(0);
                           }

                       } else {
                           System.out.println("Not Found");
                       }
                   }}
               else if (destination.equals("Lahore")){
                   for (j = 0; j <= sold[3]; j++) {
                       if (searchid == c[j].getCustomerid()) {
                           System.out.println("Found at " + j + 1);
                           System.out.println("Customer name:" + c[j].getName());
                           System.out.println("Customer PhoneNo:" + c[j].getPhoneNO());
                           System.out.println("Customer Age:" + c[j].getAge());
                           System.out.println("Customer Address:" + c[j].getAddress());
                           System.out.println("Customer Travelling Date:" + t[j].getDate());
                           System.out.println("Customer Destination:" + t[j].getDestination());
                           System.out.println("Customer Bus Time:" + t[j].getTime());
                           System.out.println("Customer Bus Number:" + t[j].getBusno());
                           System.out.println("Customer Seat Number:" + t[j].getSeatno());
                           System.out.println("Customer Payable Amount:" + t[j].getPayableAmount());
                           try{
                               System.out.println("Do you want to print ticket?[Y/N]");
                               answer = sc.next().charAt(0);
                           }catch (InputMismatchException am){
                               Scanner a47=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               answer=a47.next().charAt(0);
                           }
                           if ((answer == 'Y') || (answer == 'y')) {
                               t[j].PrintTicket();
                           }
                           else{
                               System.exit(0);
                           }

                       } else {
                           System.out.println("Not Found");
                       }
                   }}
               else {
                   for (j = 0; j <= sold[4]; j++) {
                       if (searchid == c[j].getCustomerid()) {
                           System.out.println("Found at " + j + 1);
                           System.out.println("Customer name:" + c[j].getName());
                           System.out.println("Customer PhoneNo:" + c[j].getPhoneNO());
                           System.out.println("Customer Age:" + c[j].getAge());
                           System.out.println("Customer Address:" + c[j].getAddress());
                           System.out.println("Customer Travelling Date:" + t[j].getDate());
                           System.out.println("Customer Destination:" + t[j].getDestination());
                           System.out.println("Customer Bus Time:" + t[j].getTime());
                           System.out.println("Customer Bus Number:" + t[j].getBusno());
                           System.out.println("Customer Seat Number:" + t[j].getSeatno());
                           System.out.println("Customer Payable Amount:" + t[j].getPayableAmount());
                           try{
                               System.out.println("Do you want to print ticket?[Y/N]");
                               answer = sc.next().charAt(0);
                           }catch (InputMismatchException am){
                               Scanner a47=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               answer=a47.next().charAt(0);
                           }
                           if ((answer == 'Y') || (answer == 'y')) {
                               t[j].PrintTicket();
                           }
                           else{
                               System.exit(0);
                           }

                       } else {
                           System.out.println("Not Found");
                       }
                   }}
           }
            else if (choice == 3) {
               try{System.out.println("Enter Customer ID ");
               searchid = sc.nextInt();}catch(InputMismatchException an){
                   Scanner a48=new Scanner(System.in);
                   System.out.println("Invalid Input Please enter again");
                   searchid=a48.nextInt();
               }
               try{
                   System.out.println("Enter Destination ");
                   destination = sc.next();
               }catch (InputMismatchException arep){
                   Scanner a57=new Scanner(System.in);
                   System.out.println("Invalid Input Please enter again");
                   destination=a57.next();
               }
               if (destination.equals("Hyderabad")){
               for (j = 0; j <= sold[0]; j++) {
                   if (searchid == c[j].getCustomerid()) {
                       System.out.println("Found at " + j + 1);
                       amount = t[j].getPayableAmount();
                           available[0]=available[0]+1;
                       }
                       for (;j <= c.length; j++) {
                           c[j + 1].setAddress(c[j].getAddress());
                           c[j + 1].setAge(c[j].getAge());
                           c[j + 1].setName(c[j].getName());
                           c[j + 1].setPhoneNO(c[j].getPhoneNO());
                           c[j + 1].setCustomerid(c[j].getCustomerid());
                           t[j + 1].setBusno(t[j].getBusno());
                           t[j + 1].setDate(t[j].getDate());
                           t[j + 1].setDestination(t[j].getDestination());
                           t[j + 1].setSource(t[j].getSource());
                           t[j + 1].setTime(t[j].getTime());
                           t[j + 1].setPayableAmount(t[j].getPayableAmount());
                       }
                           sold[0]=sold[0]-1;
                       System.out.println("Deleted Sucessfully");
                       try{System.out.println("Do you want cash Or a Bank transfer?");
                       ans = sc.next();}catch (InputMismatchException al){
                           Scanner a49=new Scanner(System.in);
                           System.out.println("Invalid Input Please enter again");
                           ans=a49.next();
                       }

                       if (ans.equals("cash") || ans.equals("Cash")) {
                           System.out.println("Please Go to the Accounts Department and receive it");
                       } else {
                           String iban;
                           try{ System.out.println("Please enter your IBAN number");
                           iban = sc.next();}catch (InputMismatchException av){
                              Scanner a50=new Scanner(System.in);
                              System.out.println("Invalid Input Please enter again");
                              iban=a50.next();
                          }
                           System.out.println("Bank Transaction completed. Thank you");
                       }
                   }}
               else if (destination.equals("Sukkur")){
                       for (j = 0; j <= sold[1]; j++) {
                           if (searchid == c[j].getCustomerid()) {
                               System.out.println("Found at " + j + 1);
                               amount = t[j].getPayableAmount();
                               available[1]=available[1]+1;
                           }
                           for (;j <= c.length; j++) {
                               c[j + 1].setAddress(c[j].getAddress());
                               c[j + 1].setAge(c[j].getAge());
                               c[j + 1].setName(c[j].getName());
                               c[j + 1].setPhoneNO(c[j].getPhoneNO());
                               c[j + 1].setCustomerid(c[j].getCustomerid());
                               t[j + 1].setBusno(t[j].getBusno());
                               t[j + 1].setDate(t[j].getDate());
                               t[j + 1].setDestination(t[j].getDestination());
                               t[j + 1].setSource(t[j].getSource());
                               t[j + 1].setTime(t[j].getTime());
                               t[j + 1].setPayableAmount(t[j].getPayableAmount());
                           }
                           sold[1]=sold[1]-1;
                           System.out.println("Deleted Sucessfully");
                           try{System.out.println("Do you want cash Or a Bank transfer?");
                               ans = sc.next();}catch (InputMismatchException al){
                               Scanner a49=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               ans=a49.next();
                           }

                           if (ans.equals("cash") || ans.equals("Cash")) {
                               System.out.println("Please Go to the Accounts Department and receive it");
                           } else {
                               String iban;
                               try{ System.out.println("Please enter your IBAN number");
                                   iban = sc.next();}catch (InputMismatchException av){
                                   Scanner a50=new Scanner(System.in);
                                   System.out.println("Invalid Input Please enter again");
                                   iban=a50.next();
                               }
                               System.out.println("Bank Transaction completed. Thank you");
                           }
                       }

               }
               else if (destination.equals("Rohri")){
                   for (j = 0; j <= sold[3]; j++) {
                       if (searchid == c[j].getCustomerid()) {
                           System.out.println("Found at " + j + 1);
                           amount = t[j].getPayableAmount();
                           available[2]=available[2]+1;
                       }
                       for (;j <= c.length; j++) {
                           c[j + 1].setAddress(c[j].getAddress());
                           c[j + 1].setAge(c[j].getAge());
                           c[j + 1].setName(c[j].getName());
                           c[j + 1].setPhoneNO(c[j].getPhoneNO());
                           c[j + 1].setCustomerid(c[j].getCustomerid());
                           t[j + 1].setBusno(t[j].getBusno());
                           t[j + 1].setDate(t[j].getDate());
                           t[j + 1].setDestination(t[j].getDestination());
                           t[j + 1].setSource(t[j].getSource());
                           t[j + 1].setTime(t[j].getTime());
                           t[j + 1].setPayableAmount(t[j].getPayableAmount());
                       }
                       sold[2]=sold[2]-1;
                       System.out.println("Deleted Sucessfully");
                       try{System.out.println("Do you want cash Or a Bank transfer?");
                           ans = sc.next();}catch (InputMismatchException al){
                           Scanner a49=new Scanner(System.in);
                           System.out.println("Invalid Input Please enter again");
                           ans=a49.next();
                       }

                       if (ans.equals("cash") || ans.equals("Cash")) {
                           System.out.println("Please Go to the Accounts Department and receive it");
                       } else {
                           String iban;
                           try{ System.out.println("Please enter your IBAN number");
                               iban = sc.next();}catch (InputMismatchException av){
                               Scanner a50=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               iban=a50.next();
                           }
                           System.out.println("Bank Transaction completed. Thank you");
                       }
                   }
           }
               else if (destination.equals("Lahore")){
                   for (j = 0; j <= sold[3]; j++) {
                       if (searchid == c[j].getCustomerid()) {
                           System.out.println("Found at " + j + 1);
                           amount = t[j].getPayableAmount();
                           available[3]=available[3]+1;
                       }
                       for (;j <= c.length; j++) {
                           c[j + 1].setAddress(c[j].getAddress());
                           c[j + 1].setAge(c[j].getAge());
                           c[j + 1].setName(c[j].getName());
                           c[j + 1].setPhoneNO(c[j].getPhoneNO());
                           c[j + 1].setCustomerid(c[j].getCustomerid());
                           t[j + 1].setBusno(t[j].getBusno());
                           t[j + 1].setDate(t[j].getDate());
                           t[j + 1].setDestination(t[j].getDestination());
                           t[j + 1].setSource(t[j].getSource());
                           t[j + 1].setTime(t[j].getTime());
                           t[j + 1].setPayableAmount(t[j].getPayableAmount());
                       }
                       sold[3]=sold[3]-1;
                       System.out.println("Deleted Sucessfully");
                       try{System.out.println("Do you want cash Or a Bank transfer?");
                           ans = sc.next();}catch (InputMismatchException al){
                           Scanner a49=new Scanner(System.in);
                           System.out.println("Invalid Input Please enter again");
                           ans=a49.next();
                       }

                       if (ans.equals("cash") || ans.equals("Cash")) {
                           System.out.println("Please Go to the Accounts Department and receive it");
                       } else {
                           String iban;
                           try{ System.out.println("Please enter your IBAN number");
                               iban = sc.next();}catch (InputMismatchException av){
                               Scanner a50=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               iban=a50.next();
                           }
                           System.out.println("Bank Transaction completed. Thank you");
                       }
                   }
            }
             else  if (destination.equals("Islamabad")){
                   for (j = 0; j <= sold[4]; j++) {
                       if (searchid == c[j].getCustomerid()) {
                           System.out.println("Found at " + j + 1);
                           amount = t[j].getPayableAmount();
                           available[4]=available[4]+1;
                       }
                       for (;j <= c.length; j++) {
                           c[j + 1].setAddress(c[j].getAddress());
                           c[j + 1].setAge(c[j].getAge());
                           c[j + 1].setName(c[j].getName());
                           c[j + 1].setPhoneNO(c[j].getPhoneNO());
                           c[j + 1].setCustomerid(c[j].getCustomerid());
                           t[j + 1].setBusno(t[j].getBusno());
                           t[j + 1].setDate(t[j].getDate());
                           t[j + 1].setDestination(t[j].getDestination());
                           t[j + 1].setSource(t[j].getSource());
                           t[j + 1].setTime(t[j].getTime());
                           t[j + 1].setPayableAmount(t[j].getPayableAmount());
                       }
                       sold[4]=sold[4]-1;
                       System.out.println("Deleted Sucessfully");
                       try{System.out.println("Do you want cash Or a Bank transfer?");
                           ans = sc.next();}catch (InputMismatchException al){
                           Scanner a49=new Scanner(System.in);
                           System.out.println("Invalid Input Please enter again");
                           ans=a49.next();
                       }

                       if (ans.equals("cash") || ans.equals("Cash")) {
                           System.out.println("Please Go to the Accounts Department and receive it");
                       } else {
                           String iban;
                           try{ System.out.println("Please enter your IBAN number");
                               iban = sc.next();}catch (InputMismatchException av){
                               Scanner a50=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               iban=a50.next();
                           }
                           System.out.println("Bank Transaction completed. Thank you");
                       }
                   }}}
            else if (choice == 4) {
               try{System.out.println("Enter Customer ID ");
               searchid = sc.nextInt();}catch (InputMismatchException ax){
                   Scanner a51=new Scanner(System.in);
                   System.out.println("Invalid Input Please enter again");
                   searchid=a51.nextInt();
               }
               try{
                   System.out.println("Enter Destination ");
                   destination = sc.next();
               }catch (InputMismatchException arep1){
                   Scanner a57=new Scanner(System.in);
                   System.out.println("Invalid Input Please enter again");
                   destination=a57.next();
               }
               if (destination.equals("Hyderabad")){
                   for (j = 0; j <= sold[0]; j++) {
                       if (searchid == c[j].getCustomerid()) {
                           System.out.println("Please Pay" + t[j].getPayableAmount());
                           try {
                               System.out.println("Would like to pay cash or via bank?");
                               ans = sc.next();
                           } catch (InputMismatchException aq) {
                               Scanner a52 = new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               ans = a52.next();
                           }
                           if (ans == "cash" || ans == "Cash") {
                               System.out.println("Please clear your dues in the Accounts Department");
                           } else {
                               System.out.println("Our IBAN number is PK234265746289");
                               System.out.println("Please clear your dues");
                           }
                       }
                   }
                   System.out.println("Thank you");
               }
               else if (destination.equals("Sukkur")){
                   for (j = 0; j <= sold[1]; j++) {
                       if (searchid == c[j].getCustomerid()) {
                           System.out.println("Please Pay" + t[j].getPayableAmount());
                           try{System.out.println("Would like to pay cash or via bank?");
                               ans = sc.next();}catch (InputMismatchException aq){
                               Scanner a52=new Scanner(System.in);
                               System.out.println("Invalid Input Please enter again");
                               ans=a52.next();
                           }
                           if (ans == "cash" || ans == "Cash") {
                               System.out.println("Please clear your dues in the Accounts Department");
                           } else {
                               System.out.println("Our IBAN number is PK234265746289");
                               System.out.println("Please clear your dues");
                           }
                       }
                   }
                   System.out.println("Thank you");}
                      else if (destination.equals("Rohri")){
                       for (j = 0; j <= sold[0]; j++) {
                           if (searchid == c[j].getCustomerid()) {
                               System.out.println("Please Pay" + t[j].getPayableAmount());
                               try{System.out.println("Would like to pay cash or via bank?");
                                   ans = sc.next();}catch (InputMismatchException aq){
                                   Scanner a52=new Scanner(System.in);
                                   System.out.println("Invalid Input Please enter again");
                                   ans=a52.next();
                               }
                               if (ans == "cash" || ans == "Cash") {
                                   System.out.println("Please clear your dues in the Accounts Department");
                               } else {
                                   System.out.println("Our IBAN number is PK234265746289");
                                   System.out.println("Please clear your dues");
                               }
                           }
                       }
                       System.out.println("Thank you");
                      }

                        else if (destination.equals("Lahore")){
                           for (j = 0; j <= sold[3]; j++) {
                               if (searchid == c[j].getCustomerid()) {
                                   System.out.println("Please Pay" + t[j].getPayableAmount());
                                   try{System.out.println("Would like to pay cash or via bank?");
                                       ans = sc.next();}catch (InputMismatchException aq){
                                       Scanner a52=new Scanner(System.in);
                                       System.out.println("Invalid Input Please enter again");
                                       ans=a52.next();
                                   }
                                   if (ans == "cash" || ans == "Cash") {
                                       System.out.println("Please clear your dues in the Accounts Department");
                                   } else {
                                       System.out.println("Our IBAN number is PK234265746289");
                                       System.out.println("Please clear your dues");
                                   }
                               }
                           }
                           System.out.println("Thank you");}
                        else {
                                   for (j = 0; j <= sold[4]; j++) {
                                       if (searchid == c[j].getCustomerid()) {
                                           System.out.println("Please Pay" + t[j].getPayableAmount());
                                           try{System.out.println("Would like to pay cash or via bank?");
                                               ans = sc.next();}catch (InputMismatchException aq){
                                               Scanner a52=new Scanner(System.in);
                                               System.out.println("Invalid Input Please enter again");
                                               ans=a52.next();
                                           }
                                           if (ans == "cash" || ans == "Cash") {
                                               System.out.println("Please clear your dues in the Accounts Department");
                                           } else {
                                               System.out.println("Our IBAN number is PK234265746289");
                                               System.out.println("Please clear your dues");
                                           }
                                       }
                                   }
                                   System.out.println("Thank you");
                               }
                       }
           else if (choice == 5) {
               System.exit(0);
           }
       }catch(InputMismatchException ar){
           System.out.println("Invalid Input");
           Scanner a55=new Scanner(System.in);
           System.out.println("Please enter valid input");
           choice=a55.nextInt();
        } finally{
           }

    }}



