package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import organicPets.OrganicCat;
import organicPets.OrganicDog;
import organicPets.OrganicPet;
import roboticPets.RoboticCat;
import roboticPets.RoboticDog;
import roboticPets.RoboticPet;

public class VirtualPetShelter {

	Map<String, VirtualPet> shelter = new HashMap<>();
	ArrayList<VirtualPet> selectedPets = new ArrayList<VirtualPet>();

	public void addVitrtualPetToShelter(VirtualPet pet) {
		shelter.put(pet.getName(), pet);
	}

	public int getShelterSize() {
		return shelter.size();
	}

	public void removeVirtualPetFromShelter(VirtualPet pet) {
		shelter.remove(pet.getName());
	}

	public String getNameFromList(VirtualPet pet) {
		// VirtualPet petFromMap = shelter.get(pet.getName());
		return (pet.getName());
	}

	public VirtualPet getPet(String petName) {
		return shelter.get(petName);
	}

	public String printAllPets() {
		String petList = "";
		for (VirtualPet pet : shelter.values()) {
			petList += pet.getName() + "   " + getPetType(pet) + "\n";
		}
		return petList;
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
		removeVirtualPetFromShelter(pet);
	}
	
	public void playWithAllPets() {
		for(VirtualPet placeHolder : selectedPets) {
			placeHolder.play();
		}
	}

	public void walkAllPets() {
		for(VirtualPet placeHolder : selectedPets) {
			placeHolder.walk();
		}
		
	}

	public void feedAllPets() {
		for(VirtualPet placeHolder : selectedPets) {
			((OrganicPet)placeHolder).feed();
		}
		
	}

	public void cleanAllPets() {
		for(VirtualPet placeHolder : selectedPets) {
			((OrganicPet)placeHolder).clean();
		}
		
	}

	public String printOrganicPets() {
		String petList = "";
		for (VirtualPet pet : shelter.values()) {
			if(pet instanceof OrganicPet)
			petList += pet.getName() + "\n";
		}
		return petList;
	}
	public String printRoboticPets() {
		String petList = "";
		for (VirtualPet pet : shelter.values()) {
			if(pet instanceof RoboticPet)
			petList += pet.getName() + "\n";
		}
		return petList;
	}

	public boolean hasOrganic() {
		for(VirtualPet pet : shelter.values()) {
			if(pet instanceof OrganicPet) return true;
		}
		return false;
	}
	public boolean hasRobotic() {
		for(VirtualPet pet : shelter.values()) {
			if(pet instanceof RoboticPet) return true;
		}
		return false;
	}

	public void fuelAllPets() {
		for(VirtualPet placeHolder : selectedPets) {
			((RoboticPet)placeHolder).fillTank();
		}
		
	}

	public void repairAllPets() {
		for(VirtualPet placeHolder : selectedPets) {
			((RoboticPet)placeHolder).repair();
		}
		
	}

}
