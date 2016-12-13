package EXc.abstractFactory.autofactories;

import EXc.abstractFactory.autoparts.HeadLight;
import EXc.abstractFactory.autoparts.Tire;

public abstract class Factory 
{
	public abstract Tire makeTire();
	
	public abstract HeadLight makeHeadLight();
}

