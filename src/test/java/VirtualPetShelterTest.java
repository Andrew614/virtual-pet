import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetShelterTest {
	VirtualPet pet1 = new VirtualPet("Kendrick");
	VirtualPet pet2 = new VirtualPet("Foo Foo");
	
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
		String petListTest = shelter1.printAllPets();
		
		assertThat(petListTest, is("Foo Foo\nKendrick"));
	}
	/*@Test
	public void canPrintStatusTable() {
		shelter1.addVitrtualPetToShelter(pet1);
		shelter1.addVitrtualPetToShelter(pet2);
		String petListTest = shelter1.printAllPets();
		assertThat();
	}*/
}
