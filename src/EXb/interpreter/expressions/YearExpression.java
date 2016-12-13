package EXb.interpreter.expressions;
import java.util.Date;

import EXb.interpreter.Context;

public class YearExpression extends AbstractExpression
{

  @Override
  public void evaluate( Context context )
  {
    String expression = context.getExpression();
    Date date = context.getDate();
    Integer year = new Integer(date.getYear() + 1900);
    String tempExpression = expression.replaceAll("YYYY", year.toString());
    context.setExpression(tempExpression);
  }

}