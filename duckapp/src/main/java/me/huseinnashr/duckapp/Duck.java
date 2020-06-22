package me.huseinnashr.duckapp;

import me.huseinnashr.duckapp.behaviour.fly.FlyBehaviour;
import me.huseinnashr.duckapp.behaviour.quack.QuackBehaviour;

public abstract class Duck {

  FlyBehaviour flyBehaviour;
  QuackBehaviour quackBehaviour;

  public Duck() {
  }

  public abstract void display();

  public void performFly() {
    flyBehaviour.fly();
  }

  public void performQuack() {
    quackBehaviour.quack();
  }

  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }
}