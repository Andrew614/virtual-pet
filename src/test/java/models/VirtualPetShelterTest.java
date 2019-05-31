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
	@Test
	public void testName() throws Exception {
    	System.out.printf("%1$-20s %2$10s %3$10s %4$10s %5$10s \n", "Pet Name", "Hunger Level", "Boredom Level", "Thirst Level", "Age");

	}

	@Test
	public void shouldReturnTrueIfShelterContainsKendrick() {
		shelter1.addVitrtualPetToShelter(pet1);
		assertThat(shelter1.shelterContainsName("Kendrick"), is(true));
	}
	
	@Test
	public void shouldReturnFalseIfShelterDoesNotContainKendrick() {
		shelter1.addVitrtualPetToShelter(pet2);
		shelter1.shelterContainsName(pet1.getName());
		assertThat(shelter1.shelterContainsName("Kendrick"), is(false));
	}

	@Test
	public void shouldReturnStringContainingKendrick() {
		shelter1.addVitrtualPetToShelter(pet1);
		shelter1.printAllPets();
		assertThat(shelter1.printAllPets(), is("Kendrick\n"));
	}
	
	@Test
	public void shouldReturnStringContainingKendrickAndFooFoo() {
		shelter1.addVitrtualPetToShelter(pet1);
		shelter1.addVitrtualPetToShelter(pet2);
		assertThat(shelter1.printAllPets(), is("Foo Foo\nKendrick\n"));
	}
	
	@Test
	public void shouldReturnMaintenanceLevelOf0WhenRoboticPetIsRepaired() {
		shelter1.addVitrtualPetToShelter(pet3);
		shelter1.repairAllPets();
		assertThat(pet3.getMaintenanceLevel(), is(0));
	}
	
	@Test
	public void shouldReturnMaintenanceLevelOf0WhenRoboticPetsIsRepaired() {
		shelter1.addVitrtualPetToShelter(pet3);
		shelter1.addVitrtualPetToShelter(pet4);
		shelter1.repairAllPets();
		assertThat(pet3.getMaintenanceLevel(), is(0));
		assertThat(pet4.getMaintenanceLevel(), is(0));
	}
	
	/*@Test
	public void canPrintStatusTable() {
		shelter1.addVitrtualPetToShelter(pet1);
		shelter1.addVitrtualPetToShelter(pet2);
		String petListTest = shelter1.printAllPets();
		assertThat();
	}*/
}
