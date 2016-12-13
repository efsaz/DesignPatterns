package EXb.visitor.visits;

import EXb.visitor.visited.Address;
import EXb.visitor.visited.Customer;
import EXb.visitor.visited.Phone;
 public class VisitorString implements Visitor
    {
        public String strData;
		@Override
		public void visit(Customer obj) {
			// TODO Auto-generated method stub
            strData = "Customer Name :- " + obj.strCustomerName + "\r\n";
		}
		@Override
		public void visit(Address obj) {
			// TODO Auto-generated method stub
            strData = strData + "Address 1 :- " + obj.strAddress1 + "\r\n";
            strData = strData + "Address 2 :- " + obj.strAddress2 + "\r\n";
		}
		@Override
		public void visit(Phone obj) {
			// TODO Auto-generated method stub
            strData = strData + "Phone :- " + obj.strPhoneNumber + "\r\n";
		}
    }