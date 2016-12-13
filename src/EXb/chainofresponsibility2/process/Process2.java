package EXb.chainofresponsibility2.process;
public class Process2 extends AbstractProcess {

   public Process2(){
		level = 2;
   }

   @Override
   protected void write(String message) {		
	      System.out.println("Run Process 2: " + message);
   }
}