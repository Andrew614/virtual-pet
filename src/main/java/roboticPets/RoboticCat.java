package roboticPets;

import interfaces.Cat;

public class RoboticCat extends RoboticPet implements Cat {
	
	public RoboticCat(String petName) {
		super(petName);
	}
	
	@Override
	public String meow() {
		return "Meow";
	}

	



}
