package EXb.interpreter2.expressions;
public class TerminalExpression implements Expression {
	
   private String data;

   public TerminalExpression(String data){
      this.data = data; 
   }

   @Override
   public boolean evaluate(String context) {
   
      if(context.contains(data)){
         return true;
      }
      return false;
   }
}