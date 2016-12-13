package EXb.memento2;
public class Memento {
   private String state;
   private String var1;
   private String var2;
   private String var3;

   public Memento(String state, String var1, String var2, String var3){
      this.state = state;
      this.var1 = var1;
      this.var2 = var2;
      this.var3 = var3;
   }

   public String getState(){
      return state;
   }

	public String getVar1() {
		return var1;
	}
	
	public String getVar2() {
		return var2;
	}
	
	public String getVar3() {
		return var3;
	}
}