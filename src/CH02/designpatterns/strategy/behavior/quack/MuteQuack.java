package CH02.designpatterns.strategy.behavior.quack;

import CH02.designpatterns.strategy.behavior.QuackBehavior;


public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
