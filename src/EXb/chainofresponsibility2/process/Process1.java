package EXb.chainofresponsibility2.process;
public class Process1 extends AbstractProcess {
   public Process1(){
		level = 1;
   }

   @Override
   protected void write(String message) {		
      System.out.println("Run Process 1: " + message);
   }
}