package EXc.builder2.items;
public class Video extends Gadget {

   @Override
   public float price() {
      return 50.5f;
   }

   @Override
   public String name() {
      return "Video";
   }

@Override
public void setTitle(String title) {
	// TODO Auto-generated method stub
	this.title=title;
}
}