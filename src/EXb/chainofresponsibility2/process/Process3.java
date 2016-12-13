package EXb.chainofresponsibility2.process;
public class Process3 extends AbstractProcess {

   public Process3(){
		level = 3;
   }

   @Override
   protected void write(String message) {		
	      System.out.println("Run Process 3: " + message);
   }
}