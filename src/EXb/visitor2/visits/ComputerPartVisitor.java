package EXb.visitor2.visits;

import EXb.visitor2.visited.Computer;
import EXb.visitor2.visited.Keyboard;
import EXb.visitor2.visited.Monitor;
import EXb.visitor2.visited.Mouse;

public interface ComputerPartVisitor {
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}