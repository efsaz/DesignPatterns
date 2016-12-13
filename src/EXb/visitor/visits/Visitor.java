package EXb.visitor.visits;

import EXb.visitor.visited.Address;
import EXb.visitor.visited.Customer;
import EXb.visitor.visited.Phone;

public interface Visitor {
	void visit(Customer obj);
	void visit(Address obj);
	void visit(Phone obj);
}
