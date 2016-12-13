package EXc.builder.items;

import EXc.builder.pack.Packing;
import EXc.builder.pack.Wrapper;

public abstract class Burger implements Item {

   @Override
   public Packing packing() {
      return new Wrapper();
   }

   @Override
   public abstract float price();
}