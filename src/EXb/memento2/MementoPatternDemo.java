package EXb.memento2;
public class MementoPatternDemo {
   public static void main(String[] args) {
   
      Originator originator = new Originator("var1", "varr2", "varrr3");
      CareTaker careTaker = new CareTaker();
      
      originator.setState("State #1");
      originator.setVar1("new var1");
      originator.setState("State #2");
      careTaker.add(originator.saveStateToMemento());
      
      originator.setVar2("new var2");
      originator.setState("State #3");
      careTaker.add(originator.saveStateToMemento());
      
      originator.setState("State #4");
      System.out.println("Current State: " + originator.toString());		
      
      originator.getStateFromMemento(careTaker.get(0));
      System.out.println("First saved State: " + originator.toString());
      originator.getStateFromMemento(careTaker.get(1));
      System.out.println("Second saved State: " + originator.toString());
   }
}