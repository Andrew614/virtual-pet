package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import organicPets.OrganicPet;

import roboticPets.RoboticPet;

public class VirtualPetShelter {

	Map<String, VirtualPet> shelter = new HashMap<>();
	ArrayList<VirtualPet> selectedPets = new ArrayList<VirtualPet>();
	ArrayList<VirtualPet> petsNotYetSelected = new ArrayList<VirtualPet>();

	public void addVitrtualPetToShelter(VirtualPet pet) {
		shelter.put(pet.getName(), pet);
	}

	public int getShelterSize() {
		return shelter.size();
	}

	public void removeVirtualPetFromShelter(VirtualPet pet) {
		shelter.remove(pet.getName());
	}

	public void removePetsNotYetSelected(VirtualPet pet) {
		petsNotYetSelected.remove(pet);
	}

	public void fillPetsNotYetSelected() {
		petsNotYetSelected.clear();
		for (VirtualPet placeHolder : shelter.values()) {
			petsNotYetSelected.add(placeHolder);
		}
	}

	public void clearPetArraylists() {
		petsNotYetSelected.clear();
		selectedPets.clear();
	}

	public VirtualPet getPet(String petName) {
		return shelter.get(petName);
	}

	public String printPetsNotSelected() {
		String petList = "";
		for (VirtualPet pet : petsNotYetSelected) {
			petList += pet.getName() + "   " + getPetType(pet) + "\n";
		}
		return petList;
	}

	public String printOrganicPetsNotSelected() {
		String petList = "";
		for (VirtualPet pet : petsNotYetSelected) {
			if (pet instanceof OrganicPet)
				petList += pet.getName() + "   " + getPetType(pet) + "\n";
		}
		return petList;
	}

	public String printRoboticPetsNotSelected() {
		String petList = "";
		for (VirtualPet pet : petsNotYetSelected) {
			if (pet instanceof RoboticPet)
				petList += pet.getName() + "   " + getPetType(pet) + "\n";
		}
		return petList;
	}

	public int getPetsNotSelectedSize() {
		return petsNotYetSelected.size();
	}

	public void removeDeadPets() {
		for (VirtualPet pet : shelter.values()) {
			if (!pet.getIsAlive() || pet.getRanAway()) {
				removeVirtualPetFromShelter(pet);
			}
		}
	}

	public String getPetType(VirtualPet pet) {
		if (pet instanceof OrganicPet)
			return "OrganicPet";
		if (pet instanceof RoboticPet)
			return "RoboticPet";

		return "";

	}

	public void addToSelectedPets(VirtualPet pet) {
		selectedPets.add(pet);
		removePetsNotYetSelected(pet);
	}

	public void tickAllPets() {
		for (VirtualPet placeHolder : shelter.values()) {
			placeHolder.tick();
		}
	}

	public void playWithAllPets() {
		for (VirtualPet placeHolder : selectedPets) {
			placeHolder.play();
		}
	}

	public void walkAllPets() {
		for (VirtualPet placeHolder : selectedPets) {
			placeHolder.walk();
		}

	}

	public void feedAllPets() {
		for (VirtualPet placeHolder : selectedPets) {
			if (placeHolder instanceof OrganicPet)
				((OrganicPet) placeHolder).feed();
		}

	}

	public void cleanAllPets() {
		for (VirtualPet placeHolder : selectedPets) {
			if (placeHolder instanceof OrganicPet)
				((OrganicPet) placeHolder).clean();
		}

	}

	public String printOrganicPets() {
		String petList = "";
		for (VirtualPet pet : petsNotYetSelected) {
			if (pet instanceof OrganicPet && pet.getIsAlive() && !pet.getRanAway())
				petList += pet.getName() + "\n";
		}
		return petList;
	}

	public String printRoboticPets() {
		String petList = "";
		for (VirtualPet pet : petsNotYetSelected) {
			if (pet instanceof RoboticPet && pet.getIsAlive() && !pet.getRanAway())
				petList += pet.getName() + "\n";
		}
		return petList;
	}

	public boolean hasOrganic() {
		for (VirtualPet pet : petsNotYetSelected) {
			if (pet instanceof OrganicPet)
				return true;
		}
		return false;
	}

	public boolean hasRobotic() {
		for (VirtualPet pet : petsNotYetSelected) {
			if (pet instanceof RoboticPet)
				return true;
		}
		return false;
	}

	public void fuelAllPets() {
		for (VirtualPet placeHolder : selectedPets) {
			if (placeHolder instanceof RoboticPet)
				((RoboticPet) placeHolder).fillTank();
		}

	}

	public void repairAllPets() {
		for (VirtualPet placeHolder : selectedPets) {
			if (placeHolder instanceof RoboticPet)
				((RoboticPet) placeHolder).repair();
		}

	}

	public String printAllPets() {
		String petList = "";
		for (VirtualPet pet : shelter.values()) {
			petList += pet.getName() + "\n";
		}
		return petList;
	}

	public boolean shelterContainsName(String petName) {
		if (shelter.containsKey(petName))
			return true;
		return false;
	}

	public void organicPrintStatus() {
		System.out.printf("\n%1$-20s %2$10s %3$10s %4$10s %5$10s \n", "Organic Pet Name", "Hunger", "Boredom", "Thirst",
				"Age");
		for (VirtualPet pet : shelter.values()) {
			if (pet instanceof OrganicPet && pet.getIsAlive() && !pet.getRanAway())
				System.out.printf("%1$-20s %2$10d %3$10d %4$10d %5$10d \n", pet.getName(),
						((OrganicPet) pet).getHunger(), pet.getBoredom(), ((OrganicPet) pet).getThirst(), pet.getAge());
		}
	}

	public void roboticPrintStatus() {
		System.out.printf("\n%1$-20s %2$10s %3$10s %4$10s %5$10s \n", "Robotic Pet Name", "Oil", "Boredom",
				"Mainteneance", "Age");
		for (VirtualPet pet : shelter.values()) {
			if (pet instanceof RoboticPet && pet.getIsAlive() && !pet.getRanAway())
				System.out.printf("%1$-20s %2$10d %3$10d %4$10d %5$10d \n", pet.getName(),
						((RoboticPet) pet).getOilLevel(), pet.getBoredom(), ((RoboticPet) pet).getMaintenanceLevel(),
						pet.getAge());
		}
	}
}

