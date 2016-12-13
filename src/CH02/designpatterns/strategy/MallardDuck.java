package CH02.designpatterns.strategy;

import CH02.designpatterns.strategy.behavior.fly.FlyWithWings;
import CH02.designpatterns.strategy.behavior.quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {

		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();

	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
