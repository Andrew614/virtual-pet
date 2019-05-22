import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetShelterTest {

	@Test
	public void canAddPetToShelter() {
		VirtualPetShelter shelter1 = new VirtualPetShelter();
		VirtualPet pet1 = new VirtualPet("Kendrick");
		shelter1.addVitrtualPetToShelter(pet1);
		assertEquals(1, shelter1.getShelterSize());

	}
	@Test
	public void canAddTwoPetsToShelter() {
		VirtualPetShelter shelter1 = new VirtualPetShelter();
		VirtualPet pet1 = new VirtualPet("Kendrick");
		VirtualPet pet2 = new VirtualPet("FooFoo");
		shelter1.addVitrtualPetToShelter(pet1);
		shelter1.addVitrtualPetToShelter(pet2);
		assertEquals(2, shelter1.getShelterSize());
		}
	@Test
	public void canRemovePetFromShelter() {
		VirtualPetShelter shelter1 = new VirtualPetShelter();
		VirtualPet pet1 = new VirtualPet("Kendrick");
		VirtualPet pet2 = new VirtualPet("FooFoo");
		shelter1.addVitrtualPetToShelter(pet1);
		shelter1.addVitrtualPetToShelter(pet2);
		shelter1.removeVirtualPetFromShelter(pet1);
		assertEquals(1, shelter1.getShelterSize());
	}
	@Test
	public void canRetrievePetNameFromShelter() {
		VirtualPetShelter shelter1 = new VirtualPetShelter();
		VirtualPet pet1 = new VirtualPet("Kendrick");
		shelter1.addVitrtualPetToShelter(pet1);
		assertEquals("Kendrick", shelter1.getNameFromList(pet1));
	}
	
}
