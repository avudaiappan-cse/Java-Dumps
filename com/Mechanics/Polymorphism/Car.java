package com.Mechanics.Polymorphism;

public class Car extends Vehicle {

  private int numOfDoors;

  public Car(int numOfDoors, int maxSpeed) {
    super(maxSpeed);
    this.numOfDoors = numOfDoors;
  }

  public void setNumOfDoors(int noOfDoors) {
    this.numOfDoors = noOfDoors;
  }

  public int getNumOfDoors() {
    return numOfDoors;
  }

  public void print() {
    System.out.println("In Car!");
  }
}
