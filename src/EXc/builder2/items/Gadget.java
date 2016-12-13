package EXc.builder2.items;

public abstract class Gadget implements Item {
	String title="";

	@Override
	public abstract float price();
	
	@Override
	public abstract void setTitle(String title);	
}