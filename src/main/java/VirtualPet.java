
public class VirtualPet {
	private String petName;
	private int hunger = 10;
	private int boredom = 10;
	private int thirst = 10;

	public VirtualPet() {
	}

	public VirtualPet(String name) {
		petName = name;
	}

	public String getName() {
		return petName;
	}

	public int getHunger() {
		return hunger;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getThirst() {
		return thirst;
	}

	public void setPetName(String setName) {
		petName = setName;

	}

	public void tick() {
		
		hunger += 10;
		boredom += 10;
		thirst += 10;


	}

	public void feed() {

		hunger -= 10;
		thirst -= 10;
		
	}
}