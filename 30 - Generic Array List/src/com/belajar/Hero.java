package com.belajar;

public class Hero {
  private String name;
  private double health;

  Hero(String name, double health) {
    this.name = name;
    this.health = health;
  }

  void setName(String newName) {
    this.name = newName;
  }

  void display() {
    System.out.println("name : " + this.name + " health : " + this.health);
  }
}
