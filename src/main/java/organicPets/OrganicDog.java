package organicPets;

public class OrganicDog extends OrganicPet{

	public OrganicDog(String petName) {
		super(petName);
	}

	@Override
	public String makeSound() {
		return "Woof Woof";
	}

}
