package CH02.designpatterns.strategy;

import CH02.designpatterns.strategy.behavior.fly.FlyNoWay;
import CH02.designpatterns.strategy.behavior.quack.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
