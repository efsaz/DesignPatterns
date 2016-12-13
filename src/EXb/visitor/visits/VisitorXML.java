package EXb.visitor.visits;

import EXb.visitor.visited.Address;
import EXb.visitor.visited.Customer;
import EXb.visitor.visited.Phone;
 public class VisitorXML implements Visitor
    {
        public String strData;
		@Override
		public void visit(Customer obj) {
			// TODO Auto-generated method stub
            strData = "<customername>" + obj.strCustomerName;
		}
		@Override
		public void visit(Address obj) {
			// TODO Auto-generated method stub
            strData = strData + "<adress>" + obj.strAddress1 + "</adress>";
            strData = strData + "<adress>" + obj.strAddress2 + "</adress>";
		}
		@Override
		public void visit(Phone obj) {
			// TODO Auto-generated method stub
            strData = strData + "<phone>" + obj.strPhoneNumber + "</phone></customername>";
		}
    }