package EXb.visitor2.visited;

import EXb.visitor2.visits.ComputerPartVisitor;

public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}