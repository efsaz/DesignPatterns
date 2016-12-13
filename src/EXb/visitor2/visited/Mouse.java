package EXb.visitor2.visited;

import EXb.visitor2.visits.ComputerPartVisitor;

public class Mouse implements ComputerPart {

   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}