package EXc.builder.items;

import EXc.builder.pack.Bottle;
import EXc.builder.pack.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
       return new Bottle();
	}

	@Override
	public abstract float price();
}