package com.day4.multithreading;

public class TicketBookingSync {

    private int availableSeats =1;

    public synchronized void bookSeat(String user){
        if(availableSeats>0){
            System.out.println(user + "is booking the seat");
            try{
                Thread.sleep(100); //Processing the booking
            }catch(Exception e){
                e.printStackTrace();
            }
            availableSeats--;
            System.out.println(user +"booked successfully");
        }
        else {
            System.out.println(user + "tried to book no seats available");
        }
    }


    public static void main(String[] args) {
        TicketBookingSync ticketBookingSync=new TicketBookingSync();

        //both the user trying to book the ticket at the same time
        Thread userA=new Thread(() ->ticketBookingSync.bookSeat("user A"));
        Thread userB=new Thread(() ->ticketBookingSync.bookSeat("user b"));

        userA.start();
        userB.start();
     }
}

