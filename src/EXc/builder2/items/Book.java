package EXc.builder2.items;
public class Book extends Gadget {

   @Override
   public float price() {
      return 25.0f;
   }

   @Override
   public String name() {
      return "Book";
   }

@Override
public void setTitle(String title) {
	// TODO Auto-generated method stub
	this.title=title;
}
}