package CH02.designpatterns.strategy;

import CH02.designpatterns.strategy.behavior.fly.FlyNoWay;
import CH02.designpatterns.strategy.behavior.quack.Squeak;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
