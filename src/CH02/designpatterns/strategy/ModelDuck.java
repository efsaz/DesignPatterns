package CH02.designpatterns.strategy;

import CH02.designpatterns.strategy.behavior.fly.FlyNoWay;
import CH02.designpatterns.strategy.behavior.quack.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
