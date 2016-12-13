package EXb.visitor;

import EXb.visitor.visited.Customer;
import EXb.visitor.visited.Element;
import EXb.visitor.visits.Visitor;
import EXb.visitor.visits.VisitorString;
import EXb.visitor.visits.VisitorXML;

public class VisitorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visitor vstString=new VisitorString();
		Element cstA=new Customer();
		cstA.accept(vstString);
		
		Visitor vstXML=new VisitorXML();
		Element cstB=new Customer();
		cstB.accept(vstXML);
	}

}
