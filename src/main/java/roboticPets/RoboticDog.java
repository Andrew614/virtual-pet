package roboticPets;

public class RoboticDog extends RoboticPet{

	public RoboticDog(String petName) {
		super(petName);
	}
	
	@Override
	public String makeSound() {
		return "Bark";
	}
}
