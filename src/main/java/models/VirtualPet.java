package models;

public class VirtualPet {
	protected String petName;
	protected int boredom = 10;

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


	public void setPetName(String setName) {
		petName = setName;

	}

	public void tick() {
		// extrapolate other stats from age
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