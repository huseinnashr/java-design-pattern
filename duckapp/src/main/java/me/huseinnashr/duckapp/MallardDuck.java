package me.huseinnashr.duckapp;

import me.huseinnashr.duckapp.behaviour.fly.FlyWithWings;
import me.huseinnashr.duckapp.behaviour.quack.Quack;

public class MallardDuck extends Duck {

  public MallardDuck() {
    quackBehaviour = new Quack();
    flyBehaviour = new FlyWithWings();
  }

  @Override
  public void display() {
    System.out.println("I'm a real Mallard duck");
  }

}