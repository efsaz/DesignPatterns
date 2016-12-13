package reflection.ufoships;

import reflection.ufoships.ufoparts.ESEngine;
import reflection.ufoships.ufoparts.ESWeapon;

// Here is where you define the parts that are required
// if an object wants to be an enemy ship

public interface EnemyShipFactory{
	
	public ESWeapon addESGun();
	public ESEngine addESEngine();
	
}