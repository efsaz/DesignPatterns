package EXs.filter.criteria;
import java.util.List;

import EXs.filter.Person;

public interface Criteria {
   public List<Person> meetCriteria(List<Person> persons);
}