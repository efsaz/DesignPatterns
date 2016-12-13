package EXc.builder2.items;

public abstract class Clothing implements Item {
	String title="";

	@Override
	public abstract float price();
	
	@Override
	public abstract void setTitle(String title);	
}