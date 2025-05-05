package com.pluralsight;
import java.util.Scanner;

public class Room {

     private int numberOfBeds;
     private double price;
     private boolean occupied;
     private boolean dirty;
     private boolean available;

    public int numberOfBeds(){
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public void setAvailable(boolean available) {
        this.available = available;

     }
     public double getPrice(){
         return price;
     }

//    The Room class is responsible for knowing everything related to a hotel room. A
//    room is only available if it is clean and not currently occupied. Create the class
//    with the following getters:
//    getNumberOfBeds()
//    getPrice()
//    isOccupied()
//    isDirty()
//    isAvailable()




}
