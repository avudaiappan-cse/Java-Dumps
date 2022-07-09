package com.Mechanics.Polymorphism;

public class Main {

  public static void main(String args[]) {
    Vehicle vehicle = new Car(4, 250);
    System.out.println(vehicle.getMaxSpeed());
    vehicle.print();
  }
}
