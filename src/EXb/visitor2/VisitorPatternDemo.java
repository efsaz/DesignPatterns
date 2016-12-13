package EXb.visitor2;

import EXb.visitor2.visited.Computer;
import EXb.visitor2.visited.ComputerPart;
import EXb.visitor2.visits.ComputerPartDisplayVisitor;

public class VisitorPatternDemo {
   public static void main(String[] args) {

      ComputerPart computer = new Computer();
      computer.accept(new ComputerPartDisplayVisitor());
   }
}