package CH02.designpatterns.strategy.behavior.fly;

import CH02.designpatterns.strategy.behavior.FlyBehavior;


public class FlyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}
}
