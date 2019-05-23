import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetShelterTest {
	VirtualPet pet1 = new VirtualPet("Kendrick");
	VirtualPet pet2 = new VirtualPet("Foo Foo");
	VirtualPet pet3 = new VirtualPet("Bar Bar");
	
	VirtualPetShelter shelter1 = new VirtualPetShelter();

	@Test
	public void canAddPetToShelter() {
		shelter1.addVitrtualPetToShelter(pet1);
		assertEquals(1, shelter1.getShelterSize());

	}
	@Test
	public void canAddTwoPetsToShelter() {
		shelter1.addVitrtualPetToShelter(pet1);
		shelter1.addVitrtualPetToShelter(pet2);
		assertEquals(2, shelter1.getShelterSize());
		}
	@Test
	public void canRemovePetFromShelter() {
		shelter1.addVitrtualPetToShelter(pet1);
		shelter1.addVitrtualPetToShelter(pet2);
		shelter1.removeVirtualPetFromShelter(pet1);
		assertEquals(1, shelter1.getShelterSize());
	}
	@Test
	public void canRetrievePetNameFromShelter() {
		shelter1.addVitrtualPetToShelter(pet1);
		String pet1Name = shelter1.getPet("Kendrick").getName();
		assertEquals("Kendrick", pet1Name);
	}
	@Test
	public void canRetrievePetAgeFromMap() {
		shelter1.addVitrtualPetToShelter(pet1);
		int pet1Age = shelter1.getPet("Kendrick").getAge();
		assertThat(pet1Age, is(0));
	}
	@Test
	public void canListMultiplePets() {
		shelter1.addVitrtualPetToShelter(pet1);
		shelter1.addVitrtualPetToShelter(pet2);
		String[][] petListTest = shelter1.petNamesAndStats();
		String pet1Name = petListTest[0][0];
		String pet2Name = petListTest[1][0];
	
		
		assertThat(pet1Name, is("Foo Foo"));
		assertThat(pet2Name, is("Kendrick"));
	}
	@Test
	public void canKillPet() {
		shelter1.addVitrtualPetToShelter(pet1);
		shelter1.addVitrtualPetToShelter(pet2);
		for(int i=0; i<50; i++) {
			pet1.tick();
			shelter1.removeDeadPets();
			if(!pet1.getIsAlive()) {
			}
		}
	
		assertEquals(1, shelter1.getShelterSize());
	}
	@Test
	public void canFeedMultiplePets() {
		shelter1.addVitrtualPetToShelter(pet1);
		shelter1.addVitrtualPetToShelter(pet2);
		shelter1.addVitrtualPetToShelter(pet3);
		shelter1.addToSelectedPets(pet2);
		shelter1.addToSelectedPets(pet3);
		shelter1.feedSelectedPets();
		assertEquals(0, pet2.getHunger());
		assertEquals(0, pet3.getHunger());
	}
	
	/*@Test
	public void canPrintStatusTable() {
		shelter1.addVitrtualPetToShelter(pet1);
		shelter1.addVitrtualPetToShelter(pet2);
		String petListTest = shelter1.printAllPets();
		assertThat();
	}*/
}
