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
        VirtualPet retrievedName = shelter.get(pet.getName());
        System.out.println(retrievedName);
		return pet.getName();
	}
}
