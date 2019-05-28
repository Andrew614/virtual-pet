package organicPets;

import models.VirtualPet;

public abstract class OrganicPet extends VirtualPet {
	protected int hunger = 10;
	protected int thirst = 10;
	protected int soilLevel = 10;
	protected boolean isSoiled = false;

	public int getSoilLevel() {
		return soilLevel;
	}

	public boolean getSoiled() {
		return isSoiled;
	}

	public OrganicPet(String petName) {
		this.petName = petName;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
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
	public void clean() {
		soilLevel = 0;
		isSoiled = false;
		
	}

	@Override
	public void tick() {
		hunger += 10;
		if (hunger < 0) {
			hunger = 0;
		} else if (hunger > 100) {
			isAlive = false;
		}
		thirst += 10;
		if (thirst < 0) {
			thirst = 0;
		} else if (thirst > 100) {
			isAlive = false;
		}
		boredom += 10;
		if (boredom < 0) {
			boredom = 0;
		} else if (boredom > 100) {
			ranAway = true;
		}
		age += 1;
		if (age < 0) {
			age = 0;
		} else if (age >= 100) {
			isAlive = false;
		}
		soilLevel += 10;
		if (soilLevel > 50) {
			isSoiled = true;
			System.out.println("Your pet has soiled itself");
		} else if (soilLevel >= 100) {
			soilLevel = 100;
		}

	}

	@Override
	public void walk() {
		soilLevel -= 10;
		if (soilLevel < 0) {
			soilLevel = 0;
		} else if (soilLevel <= 50) {
			isSoiled = false;
			System.out.println("Your pet's area is cleaned");
		}

	}

}
