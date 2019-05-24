package models;

public class VirtualPet {
	private String petName;
	//private int hunger = 10;
	//private int thirst = 10;
	private int boredom = 10;

	private int age = 0;
	private boolean isAlive = true;

	public boolean getIsAlive() {
		return isAlive;
	}

	public int getAge() {
		return age;
	}


	public String getName() {
		return petName;
	}



	public int getBoredom() {
		return boredom;
	}

	/*public int getThirst() {
		return thirst;
	}*/

	public void setPetName(String setName) {
		petName = setName;

	}

	public void tick() {
		//extrapolate other stats from age
		age += 10;
		if (age >= 1000) {
			isAlive=false;
		}

	}



	public void play() {
		boredom -= 10;
		if (boredom < 0) {
			boredom = 0;

		} 

	}


	

}