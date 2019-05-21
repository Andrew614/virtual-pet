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
}
