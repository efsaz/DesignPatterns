package EXb.visitor.visited;

import java.util.ArrayList;

import EXb.visitor.visits.Visitor;

public class Address implements Element
{
	@Override
    public void accept(Visitor objVisitor)
    {
        objVisitor.visit(this);

        for(Phone objPhone : objPhones)
        {
        	objPhone.accept(objVisitor);
        }
    }
    public String strAddress1 = "";
    public String strAddress2 = "";
    public ArrayList<Phone> objPhones = new ArrayList<Phone>();
}