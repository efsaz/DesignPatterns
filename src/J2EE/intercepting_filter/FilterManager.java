package J2EE.intercepting_filter;

import J2EE.intercepting_filter.actual_job.Target;
import J2EE.intercepting_filter.filters.Filter;

public class FilterManager {
   FilterChain filterChain;

   public FilterManager(Target target){
      filterChain = new FilterChain();
      filterChain.setTarget(target);
   }
   public void setFilter(Filter filter){
      filterChain.addFilter(filter);
   }

   public void filterRequest(String request){
      filterChain.execute(request);
   }
}