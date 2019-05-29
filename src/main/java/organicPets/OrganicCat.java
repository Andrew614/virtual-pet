package organicPets;



public class OrganicCat extends OrganicPet{
	public OrganicCat(String petName) {
		super(petName);
	}
	@Override
	public String makeSound() {
		return "Meow";
	}

}
