package com.Mechanics.Polymorphism;

class Vehicle {

  private int maxSpeed;

  Vehicle() {
    this.maxSpeed = 250;
  }

  Vehicle(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(int speed) {
    maxSpeed = speed;
  }

  public void print() {
    System.out.println("In Vehicle!");
  }
}
