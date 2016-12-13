package EXb.chainofresponsibility2;

import EXb.chainofresponsibility.logger.AbstractLogger;
import EXb.chainofresponsibility2.process.AbstractProcess;
import EXb.chainofresponsibility2.process.Process1;
import EXb.chainofresponsibility2.process.Process2;
import EXb.chainofresponsibility2.process.Process3;

public class ChainPatternDemo {
	
   private static AbstractProcess getChainOfLoggers(){

      AbstractProcess process3 = new Process3();
      AbstractProcess process2 = new Process2();
      AbstractProcess process1 = new Process1();

      process3.setNextLogger(process2);
      process2.setNextLogger(process1);

      return process3;	
   }

   public static void main(String[] args) {
	      AbstractProcess loggerChain = getChainOfLoggers();

	      loggerChain.logMessage(AbstractLogger.INFO, 
	         "This is an information.");
	      System.out.println("INFO *****************");

	      loggerChain.logMessage(AbstractLogger.DEBUG, 
	         "This is an debug level information.");
	      System.out.println("DEBUG *****************");

	      loggerChain.logMessage(AbstractLogger.ERROR, 
	         "This is an error information.");
	      System.out.println("ERROR *****************");
   }
}