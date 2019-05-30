package roboticPets;

import models.VirtualPet;

public abstract class RoboticPet extends VirtualPet {
	protected int oilLevel = 10;
	protected int maintenanceLevel = 0;
	protected boolean needsMaintenance = false;

	public RoboticPet(String petName) {
		this.petName = petName;
	}

	public boolean getNeedsMaintenance() {
		return needsMaintenance;
	}
	
	public int getOilLevel() {
		return oilLevel;
	}

	public void repair() {
		maintenanceLevel = 0;
		needsMaintenance = false;
	}
	public void fillTank() {
		oilLevel = 0;
	}

	@Override
	public void tick() {
		oilLevel += 10;
		if (oilLevel < 0) {
			oilLevel = 0;
		} else if (oilLevel > 100) {
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
		} 
		maintenanceLevel += 10;
		if (maintenanceLevel > 50) {
			needsMaintenance = true;
			System.out.println("Your pet needs maintenance");
		} else if (maintenanceLevel >= 100) {
			isAlive = false;
		}

	}

	@Override
	public void walk() {
		maintenanceLevel += 10;
		if (maintenanceLevel > 100) {
			maintenanceLevel = 100;
		} else if (maintenanceLevel >= 50) {
			needsMaintenance = true;
			System.out.println("Your pet requires maintenance");
		}
	}

}
