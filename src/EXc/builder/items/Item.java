package EXc.builder.items;

import EXc.builder.pack.Packing;

public interface Item {
   public String name();
   public Packing packing();
   public float price();	
}