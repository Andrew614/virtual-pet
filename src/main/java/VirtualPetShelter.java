import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> shelter = new HashMap<>();

	public void addVitrtualPetToShelter(VirtualPet pet) {
		shelter.put(pet.getName(), pet);
	}

	public int getShelterSize() {
    return shelter.size();
	}

	public void removeVirtualPetFromShelter(VirtualPet pet) {
		shelter.remove(pet.getName(), pet);
	}

	public String getNameFromList(VirtualPet pet) {
       // VirtualPet petFromMap = shelter.get(pet.getName());
        return(pet.getName());
	}
	public VirtualPet getPet(String petName) {
		return shelter.get(petName);
	}

	public String printAllPets() {
		String petList = "";
		for(VirtualPet pet: shelter.values()) {
			petList += pet.getName();
			System.out.println(pet.getName());
		}
		return petList;
	}
	
/*	public String petStatus() {
		
	
		String petStatusList = "";
		for(VirtualPet pet: shelter.values()) {
			petStatusList += pet.getName()+"\t "+pet.getHunger()+"\t"+pet.getBoredom()+"\t"+ pet.getThirst()+"\n";
			
		}
		return petStatusList;
	}*/
}
