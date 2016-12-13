package EXc.abstractFactory;

import EXc.abstractFactory.autoparts.HeadLight;
import EXc.abstractFactory.autoparts.Tire;

public class Client 
{
	public void doSomeClientJob()
	{
		Tire tire = FactoryMaker.getFactory("audi").makeTire();
		System.out.println(tire.getTireModel());
		HeadLight light = FactoryMaker.getFactory("audi").makeHeadLight();
		System.out.println(light.getHeadLightModel());
	}
}

