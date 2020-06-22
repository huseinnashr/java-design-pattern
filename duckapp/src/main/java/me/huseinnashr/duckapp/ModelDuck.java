package me.huseinnashr.duckapp;

import me.huseinnashr.duckapp.behaviour.fly.FlyNoWay;
import me.huseinnashr.duckapp.behaviour.quack.Quack;

public class ModelDuck extends Duck {

  public ModelDuck() {
    flyBehaviour = new FlyNoWay();
    quackBehaviour = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I'm a model duck");
  }

}