package EXc.abstractFactory.autofactories;

import EXc.abstractFactory.autoparts.HeadLight;
import EXc.abstractFactory.autoparts.MercedesHeadLight;
import EXc.abstractFactory.autoparts.MercedesTire;
import EXc.abstractFactory.autoparts.Tire;

public class MercedesFactory extends Factory 
{
	@Override
	public Tire makeTire() 
	{
		return new MercedesTire();
	}

	@Override
	public HeadLight makeHeadLight() 
	{
		return new MercedesHeadLight();
	}
}

