package com.Mechanics.Polymorphism;

public class ClassCast {

  public static void main(String args[]) {
    Vehicle vehicle = new Car(4, 350);
    Car car = (Car) vehicle;
    System.out.println(car.getNumOfDoors());
  }
}
