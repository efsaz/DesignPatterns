package EXb.visitor.visited;

import java.util.ArrayList;

import EXb.visitor.visits.Visitor;

public class Customer implements Element
    {
        public void accept(Visitor objVisitor)
        {
            objVisitor.visit(this);

            for(Address objAddress : objAddresses)
            {
                objAddress.accept(objVisitor);
            }
        }
        public String strCustomerName = "";
        public ArrayList<Address> objAddresses = new ArrayList<Address>();
    }