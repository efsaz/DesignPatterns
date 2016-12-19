package J2EE.intercepting_filter;
import java.util.ArrayList;
import java.util.List;

import J2EE.intercepting_filter.actual_job.Target;
import J2EE.intercepting_filter.filters.Filter;

public class FilterChain {
   private List<Filter> filters = new ArrayList<Filter>();
   private Target target;

   public void addFilter(Filter filter){
      filters.add(filter);
   }

   public void execute(String request){
      for (Filter filter : filters) {
         filter.execute(request);
      }
      target.execute(request);
   }

   public void setTarget(Target target){
      this.target = target;
   }
}