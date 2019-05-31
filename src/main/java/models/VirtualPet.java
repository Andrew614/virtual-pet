package models;

public abstract class VirtualPet {

	protected String petName;
	protected int boredom = 10;
	protected int age = 0;
	protected boolean isAlive = true;
	protected boolean ranAway = false;

	public boolean getRanAway() {
		return ranAway;
	}

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

	public abstract void tick();

	public abstract void walk();

	public void play() {
		boredom -= 10;
		if (boredom < 0) {
			boredom = 0;

		} else if (boredom > 100) {

		}

	}

	public abstract String makeSound();
}
