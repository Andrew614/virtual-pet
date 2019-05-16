import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldBeAbleToCreatePet() {
		VirtualPet pet = new VirtualPet();
	}

	@Test
	public void petShouldHaveName() {
		VirtualPet underTest = new VirtualPet("Jeff");

		String expected = underTest.getName();

		assertEquals(expected, "Jeff");
	}

	@Test
	public void shouldHaveDefaultHunger() {
		VirtualPet underTest = new VirtualPet("Steve");

		int expected = underTest.getHunger();

		assertEquals(expected, 10);
	}

	@Test
	public void shouldHaveDefaultBoredom() {
		VirtualPet underTest = new VirtualPet("Steve");

		int expected = underTest.getBoredom();

		assertEquals(expected, 10);
	}

	@Test
	public void shouldHaveDefaultThirst() {
		VirtualPet underTest = new VirtualPet("Steve");

		int expected = underTest.getThirst();

		assertEquals(expected, 10);
	}

	@Test
	public void shouldTickHunger() {
		VirtualPet pet = new VirtualPet("Kendrick");

		int initialHunger = pet.getHunger();
		pet.tick();
		int hungerAfterTick = pet.getHunger();

		assertEquals(initialHunger + 10, hungerAfterTick);
	}

	@Test
	public void shouldTickThirst() {
		VirtualPet pet = new VirtualPet("Kendrick");

		int initialThirst = pet.getThirst();
		pet.tick();
		int ThirstAfterTick = pet.getThirst();

		assertEquals(initialThirst + 10, ThirstAfterTick);
	}

	@Test
	public void shouldTickBoredom() {
		VirtualPet pet = new VirtualPet("Kendrick");

		int initialBoredom = pet.getBoredom();
		pet.tick();
		int BoredomAfterTick = pet.getBoredom();

		assertEquals(initialBoredom + 10, BoredomAfterTick);
	}
	@Test
	public void feedLowersHunger() {
		VirtualPet pet = new VirtualPet("Kendrick");

		int initialHunger = pet.getHunger();
		pet.feed();
		int HungerAfterFeed = pet.getHunger();


		assertEquals(initialHunger - 10, HungerAfterTick);
		
}
	public void feedLowersThirst() {
		VirtualPet pet = new VirtualPet("Kendrick");

		int initialHunger = pet.getThirst();
		pet.feed();
		int HungerAfterTick = pet.getThirst();

		assertEquals(initialHunger - 10, HungerAfterTick);
		
}
	
}