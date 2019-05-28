package organicPets;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import organicPets.OrganicDog;

public class OrganicDogTest {
	

	@Test
	public void petShouldHaveName() {
		OrganicDog underTest = new OrganicDog("Jeff");
		String expected = underTest.getName();
		assertEquals(expected, "Jeff");
	}

	@Test
	public void shouldHaveDefaultHunger() {
		OrganicDog underTest = new OrganicDog("Steve");
		int expected = underTest.getHunger();
		assertEquals(expected, 10);
	}

	@Test
	public void shouldHaveDefaultBoredom() {
		OrganicDog underTest = new OrganicDog("Steve");
		int expected = underTest.getBoredom();
		assertEquals(expected, 10);
	}

	@Test
	public void shouldHaveDefaultThirst() {
		OrganicDog underTest = new OrganicDog("Steve");
		int expected = underTest.getThirst();
		assertEquals(expected, 10);
	}

	@Test
	public void shouldTickHunger10() {
		OrganicDog pet = new OrganicDog("Kendrick");
		int initialHunger = pet.getHunger();
		pet.tick();
		int hungerAfterTick = pet.getHunger();
		assertEquals(initialHunger + 10, hungerAfterTick);
	}

	@Test
	public void shouldTickThirst10() {
		OrganicDog pet = new OrganicDog("Kendrick");
		int initialThirst = pet.getThirst();
		pet.tick();
		int thirstAfterTick = pet.getThirst();

		assertEquals(initialThirst + 10, thirstAfterTick);
	}

	@Test
	public void shouldTickBoredom10() {
		OrganicDog pet = new OrganicDog("Kendrick");
		int initialBoredom = pet.getBoredom();
		pet.tick();
		int boredomAfterTick = pet.getBoredom();

		assertEquals(initialBoredom + 10, boredomAfterTick);
	}

	@Test
	public void feedLowersHunger() {
		OrganicDog pet = new OrganicDog("Kendrick");
		int initialHunger = pet.getHunger();
		pet.feed();
		int hungerAfterTick = pet.getHunger();
		assertEquals(initialHunger - 10, hungerAfterTick);

	}

	@Test
	public void feedLowersThirst() {
		OrganicDog pet = new OrganicDog("Kendrick");
		int initialThirst = pet.getThirst();
		pet.feed();
		int thirstAfterTick = pet.getThirst();
		assertEquals(initialThirst - 10, thirstAfterTick);

	}

	@Test
	public void playDecreasesBoredom() {
		OrganicDog pet = new OrganicDog("Kendrick");

		int initialBoredom = pet.getBoredom();
		pet.play();
		int boredomAfterTick = pet.getBoredom();

		assertEquals(initialBoredom - 10, boredomAfterTick);
	}

	@Test
	public void boredomIsAlwaysGreaterThan0() {
		OrganicDog pet = new OrganicDog("Kendrick");

		for (int i = 0; i < 4; i++) {
			pet.play();
		}
		int boredomAfterTick = pet.getBoredom();

		assertEquals(0, boredomAfterTick);
	}

	@Test
	public void hungerAndThirstIsAlwaysGreaterThan0() {
		OrganicDog pet = new OrganicDog("Kendrick");

		for (int i = 0; i < 4; i++) {
			pet.feed();
		}
		int hungerAfterTick = pet.getHunger();
		int thirstAfterTick = pet.getThirst();

		assertEquals(0, hungerAfterTick);
		assertEquals(0, thirstAfterTick);
	}
	@Test 
	public void soilLevelIsAlwaysGreaterThan0() {
		OrganicDog pet = new OrganicDog("Kendrick");
		for (int i = 0; i < 2; i++) {
			pet.walk();;
		}
		int soilLevelAfterWalk = pet.getSoilLevel();
		assertThat(soilLevelAfterWalk, is(0));
	}
	@Test 
	public void soiledShouldBeTrueWhenSoilLevelGreaterThan50() {
		OrganicDog pet = new OrganicDog("Kendrick");
		for (int i = 0; i < 6; i++) {
			pet.tick();
		}
		boolean soiledAfterTick = pet.getSoiled();
		assertThat(soiledAfterTick, is(true));
	}
	
	
}
