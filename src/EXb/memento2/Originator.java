package EXb.memento2;
public class Originator {
   private String state;
   private String var1;
   private String var2;
   private String var3;

   public Originator(String var1, String var2, String var3){
	      this.var1 = var1;
	      this.var2 = var2;
	      this.var3 = var3;
   }
   
   public void setState(String state){
      this.state = state;
   }
   public void setVar1(String var1){
	      this.var1 = var1;
   }
   public void setVar2(String var2){
	      this.var2 = var2;
   }
   public void setVar3(String var3){
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
	
   public Memento saveStateToMemento(){
      return new Memento(state, var1, var2, var3);
   }

   public void getStateFromMemento(Memento memento){
      state = memento.getState();
      var1 = memento.getVar1();
      var2 = memento.getVar2();
      var3 = memento.getVar3();
   }
   
   public String toString(){
	
	   return "state:" + this.getState() + " var1:" + this.getVar1() + " var2:" + this.getVar2() + " var3:" + this.getVar3();
   }
}