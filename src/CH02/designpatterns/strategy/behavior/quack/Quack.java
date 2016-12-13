package CH02.designpatterns.strategy.behavior.quack;

import CH02.designpatterns.strategy.behavior.QuackBehavior;



public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("Quack");
	}
}
