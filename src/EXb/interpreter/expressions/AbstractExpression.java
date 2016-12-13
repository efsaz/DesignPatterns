package EXb.interpreter.expressions;

import EXb.interpreter.Context;

public abstract class AbstractExpression
{
  public abstract void evaluate( Context context );
}