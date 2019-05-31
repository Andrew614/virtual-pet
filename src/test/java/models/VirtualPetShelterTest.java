package models;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

import models.VirtualPet;
import models.VirtualPetShelter;
import organicPets.OrganicCat;
import organicPets.OrganicDog;
import organicPets.OrganicPet;
import roboticPets.RoboticCat;
import roboticPets.RoboticDog;
import roboticPets.RoboticPet;

public class VirtualPetShelterTest {
	OrganicDog pet1 = new OrganicDog("Kendrick");
	OrganicCat pet2 = new OrganicCat("Foo Foo");
	RoboticCat pet3= new RoboticCat("Fee Fee");
	RoboticDog pet4= new RoboticDog("Doo Doo");
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
	public void canKillPet() {
		shelter1.addVitrtualPetToShelter(pet1);
		shelter1.addVitrtualPetToShelter(pet2);
		for(int i=0; i<50; i++) {
			pet1.tick();
			shelter1.removeDeadPets();
		}
		assertEquals(1, shelter1.getShelterSize());
				
				
	}
	//@Test
	public void canFillNotSelected() {
		shelter1.addVitrtualPetToShelter(pet1);
		shelter1.addVitrtualPetToShelter(pet2);
		shelter1.addVitrtualPetToShelter(pet3);
		shelter1.addVitrtualPetToShelter(pet4);
		shelter1.fillPetsNotYetSelected();
		int selectedSize = 
	}
}
