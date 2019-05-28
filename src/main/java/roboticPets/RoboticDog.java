package roboticPets;

import interfaces.Dog;

public class RoboticDog extends RoboticPet implements Dog{

	public RoboticDog(String petName) {
		super(petName);
	}
	
	@Override
	public String bark() {
		return "Bark";
	}
}
