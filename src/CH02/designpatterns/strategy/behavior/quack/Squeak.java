package CH02.designpatterns.strategy.behavior.quack;

import CH02.designpatterns.strategy.behavior.QuackBehavior;


public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}
