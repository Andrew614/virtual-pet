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
	public void shouldTickHunger10() {
		VirtualPet pet = new VirtualPet("Kendrick");

		int initialHunger = pet.getHunger();
		pet.tick();
		int hungerAfterTick = pet.getHunger();

		assertEquals(initialHunger + 10, hungerAfterTick);
	}

	@Test
	public void shouldTickThirst10() {
		VirtualPet pet = new VirtualPet("Kendrick");

		int initialThirst = pet.getThirst();
		pet.tick();
		int thirstAfterTick = pet.getThirst();

		assertEquals(initialThirst + 10, thirstAfterTick);
	}

	@Test
	public void shouldTickBoredom10() {
		VirtualPet pet = new VirtualPet("Kendrick");

		int initialBoredom = pet.getBoredom();
		pet.tick();
		int boredomAfterTick = pet.getBoredom();

		assertEquals(initialBoredom + 10, boredomAfterTick);
	}

	@Test
	public void feedLowersHunger() {
		VirtualPet pet = new VirtualPet("Kendrick");

		int initialHunger = pet.getHunger();
		pet.feed();
		int hungerAfterTick = pet.getHunger();

		assertEquals(initialHunger - 10, hungerAfterTick);

	}

	@Test
	public void feedLowersThirst() {
		VirtualPet pet = new VirtualPet("Kendrick");

		int initialThirst = pet.getThirst();
		pet.feed();
		int thirstAfterTick = pet.getThirst();

		assertEquals(initialThirst - 10, thirstAfterTick);
	}

	@Test
	public void playDecreasesBoredom() {
		VirtualPet pet = new VirtualPet("Kendrick");

		int initialBoredom = pet.getBoredom();
		pet.play();
		int boredomAfterTick = pet.getBoredom();

		assertEquals(initialBoredom - 10, boredomAfterTick);
	}

	@Test
	public void boredomIsAlwaysGreaterThan0() {
		VirtualPet pet = new VirtualPet("Kendrick");

		for (int i = 0; i < 4; i++) {
			pet.play();
		}
		int boredomAfterTick = pet.getBoredom();

		assertEquals(0, boredomAfterTick);
	}
	@Test
	public void hungerAndThirstIsAlwaysGreaterThan0() {
		VirtualPet pet = new VirtualPet("Kendrick");

		for (int i = 0; i < 4; i++) {
			pet.feed();
		}
		int hungerAfterTick = pet.getHunger();
		int thirstAfterTick = pet.getThirst();

		assertEquals(0, hungerAfterTick);
		assertEquals(0, thirstAfterTick);
	}
	
}
