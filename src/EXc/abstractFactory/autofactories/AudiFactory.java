package EXc.abstractFactory.autofactories;

import EXc.abstractFactory.autoparts.AudiHeadLight;
import EXc.abstractFactory.autoparts.AudiTire;
import EXc.abstractFactory.autoparts.HeadLight;
import EXc.abstractFactory.autoparts.Tire;

public class AudiFactory extends Factory 
{
	@Override
	public Tire makeTire() 
	{
		return new AudiTire();
	}

	@Override
	public HeadLight makeHeadLight() 
	{
		return new AudiHeadLight();
	}
}

