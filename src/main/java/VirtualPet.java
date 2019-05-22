
public class VirtualPet {
	private String petName;
	private int hunger = 10;
	private int boredom = 10;
	private int thirst = 10;
	private String petSpecies;
	private int age = 0;

	public int getAge() {
		return age;
	}

	public VirtualPet(String name) {
		petName = name;
		petSpecies = "Dog";
		age = 0;
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
		if (hunger < 0) {
			hunger = 0;
		}
		if (thirst < 0) {
			thirst = 0;
		}
	}

	public void play() {
		boredom -= 10;
		if (boredom < 0) {
			boredom = 0;

		}

	}

	public String getSpecies() {
		return petSpecies;
	}
	

}