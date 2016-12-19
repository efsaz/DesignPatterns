package J2EE.intercepting_filter;

import J2EE.intercepting_filter.actual_job.Target;
import J2EE.intercepting_filter.filters.AuthenticationFilter;
import J2EE.intercepting_filter.filters.DebugFilter;

public class InterceptingFilterDemo {
   public static void main(String[] args) {
      FilterManager filterManager = new FilterManager(new Target());
      filterManager.setFilter(new AuthenticationFilter());
      filterManager.setFilter(new DebugFilter());

      Client client = new Client();
      client.setFilterManager(filterManager);
      client.sendRequest("HOME");
   }
}