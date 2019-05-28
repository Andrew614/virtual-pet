package organicPets;

import interfaces.Cat;

public class OrganicCat extends OrganicPet implements Cat {
	public OrganicCat(String petName) {
		super(petName);
	}
	@Override
	public String meow() {
		return "Meow";
	}

}
