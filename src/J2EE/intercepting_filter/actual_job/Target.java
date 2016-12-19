package J2EE.intercepting_filter.actual_job;
public class Target {
   public void execute(String request){
      System.out.println("Executing request: " + request);
   }
}