package J2EE.business_delegate;

import J2EE.business_delegate.delegation.BusinessDelegate;

public class Client {
	
   BusinessDelegate businessService;

   public Client(BusinessDelegate businessService){
      this.businessService  = businessService;
   }

   public void doTask(){		
      businessService.doTask();
   }
}