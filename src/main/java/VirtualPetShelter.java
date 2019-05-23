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
		return (pet.getName());
	}

	public VirtualPet getPet(String petName) {
		return shelter.get(petName);
	}

	public String printAllPets() {
		String petList = "";
		for (VirtualPet pet : shelter.values()) {
			petList += pet.getName();
			System.out.println(pet.getName());
		}
		return petList;
	}

	public String[][] petNamesAndStats() {
		String[][]petNames = new String[getShelterSize()][5];
		int i = 0;
		for (VirtualPet pet : shelter.values()) {
			petNames[i][0] = pet.getName();
			petNames[i][1] = pet.getHunger()+"";
			petNames[i][2] = pet.getThirst()+"";
			petNames[i][3] = pet.getBoredom()+"";
			petNames[i][4] = pet.getAge()+"";
			
			i++;
		}
		return petNames;
	}
	/*
	public String petStatus(String[] petNames) {

		String[] petStatusList;
		for (String petName : petNames) {
			shelter.get(petName).getName();
			
		}
		return petStatusList;
	}*/
}
