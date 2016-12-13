package reflection.ufoships;

import reflection.ufoships.ufoparts.ESEngine;
import reflection.ufoships.ufoparts.ESUFOEngine;
import reflection.ufoships.ufoparts.ESUFOGun;
import reflection.ufoships.ufoparts.ESWeapon;

// This is where we define all of the parts the ship
// will use by defining the methods implemented
// being ESWeapon and ESEngine

// The returned object specifies a specific weapon & engine

public class UFOEnemyShipFactory implements EnemyShipFactory{

	// Defines the weapon object to associate with the ship
	
	public ESWeapon addESGun() {
		return new ESUFOGun(); // Specific to regular UFO
	}

	// Defines the engine object to associate with the ship
	
	public ESEngine addESEngine() {
		return new ESUFOEngine(); // Specific to regular UFO
	}
}