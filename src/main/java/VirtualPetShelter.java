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
		String out = "";
		for(VirtualPet pet: shelter.values()) {
			out += pet.getName();
			System.out.print(pet.getName());
		}
		return out;
	}
}
