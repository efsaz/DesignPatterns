package EXb.visitor.visited;

import EXb.visitor.visits.Visitor;

public class Phone implements Element
{
	@Override
	public void accept(Visitor objVisitor) {
		// TODO Auto-generated method stub
        objVisitor.visit(this);
	}
    public String strPhoneNumber = "";
}