
public class VirtualPet {
	private String petName;

	private int boredom = 10;
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


	}

	public void play() {
		boredom -= 10;
		if (boredom < 0) {
			boredom = 0;

		} else if(boredom > 100) {
			
			
		}

	}

	public String getSpecies() {
		return petSpecies;
	}
	

}