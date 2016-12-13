package EXb.nullobject;

import EXb.nullobject.customers.AbstractCustomer;
import EXb.nullobject.customers.NullCustomer;
import EXb.nullobject.customers.RealCustomer;

public class CustomerFactory {
	
   public static final String[] names = {"Rob", "Joe", "Julie"};

   public static AbstractCustomer getCustomer(String name){
   
      for (int i = 0; i < names.length; i++) {
         if (names[i].equalsIgnoreCase(name)){
            return new RealCustomer(name);
         }
      }
      return new NullCustomer();
   }
}