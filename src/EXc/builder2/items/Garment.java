package EXc.builder2.items;
public class Garment extends Clothing {

   @Override
   public float price() {
      return 35.0f;
   }

   @Override
   public String name() {
      return "Garment";
   }

   @Override
   public void setTitle(String title) {
   	// TODO Auto-generated method stub
   	this.title=title;
   }
}