package CH02.designpatterns.strategy.behavior.fly;

import CH02.designpatterns.strategy.behavior.FlyBehavior;


public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
