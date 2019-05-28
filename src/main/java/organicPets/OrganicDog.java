package organicPets;

import interfaces.Dog;

public class OrganicDog extends OrganicPet implements Dog{

	public OrganicDog(String petName) {
		super(petName);
	}
	
	@Override
	public String bark() {
		return "Woof Woof";
	}

	

}
