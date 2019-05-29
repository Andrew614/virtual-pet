package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import organicPets.OrganicCat;
import organicPets.OrganicDog;
import roboticPets.RoboticCat;
import roboticPets.RoboticDog;

public class VirtualPetShelter {

	Map<String, VirtualPet> shelter = new HashMap<>();

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
			petList += pet.getName() + "\n";
			System.out.println(pet.getName());
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
		if(pet instanceof OrganicDog)
			return "OrganicDog";
		if(pet instanceof OrganicCat)
			return "OrganicCat";
		if(pet instanceof RoboticDog)
			return "RoboticDog";
		if(pet instanceof RoboticCat)
			return "RoboticCat";
		return "";
		
		

		
	}
}
