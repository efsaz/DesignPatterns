package J2EE.business_delegate.delegation;

import J2EE.business_delegate.services.BusinessService;
import J2EE.business_delegate.services.EJBService;
import J2EE.business_delegate.services.JMSService;

public class BusinessLookUp {
   public BusinessService getBusinessService(String serviceType){
   
      if(serviceType.equalsIgnoreCase("EJB")){
         return new EJBService();
      }
      else {
         return new JMSService();
      }
   }
}