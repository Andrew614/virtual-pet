package roboticPets;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import organicPets.OrganicDog;

public class RoboticCatTest {
	RoboticCat underTest = new RoboticCat("Stella");

	@Test
	public void roboticCatNeedsMaintenanceAfterWalking5Times() {
		for (int i = 0; i < 5; i++) {
			underTest.walk();
		}
		boolean needsMaintenance = underTest.getNeedsMaintenance();
		assertThat(needsMaintenance, is(true));
	}

	@Test
	public void roboticCatDoesNotNeedMaintenanceAfterWalking5TimeAndBeingRepaired() {
		for (int i = 0; i < 5; i++) {
			underTest.walk();
		}
		underTest.repair();
		boolean needsMaintenance = underTest.getNeedsMaintenance();
		assertThat(needsMaintenance, is(false));
	}
	
	@Test
	public void oilLevelIs0AfterFillingTank() {
		underTest.fillTank();
		int oilLevelAfterFill = underTest.getOilLevel();
		assertThat(oilLevelAfterFill, is(0));
		for (int i = 0; i < 50; i++) {
			underTest.walk();
		}
		for (int i = 0; i < 50; i++) {
			underTest.tick();
		}
		assertThat(oilLevelAfterFill, is(0));
	}
	
	@Test
	public void roboticCatDiesAfter10Ticks() {
		for (int i = 0; i < 50; i++) {
			underTest.tick();
		}
		boolean isAlive = underTest.getIsAlive();
		assertThat(isAlive, is(false));
	}
	@Test
	public void catCanmakeSound() {
		String makeSound = underTest.makeSound();
		assertThat(makeSound, is("makeSound"));
	}
	@Test
	public void willRunAwayWhenBoredomIsGreaterThan100() {
		for (int i = 0; i < 10; i++) {
			underTest.tick();
		}
		boolean hasRunAway = underTest.getRanAway();
		assertThat(hasRunAway, is(true));
	}
	@Test
	public void shouldNotDieAtAge100() {
		for (int i = 0; i < 100; i++) {
			underTest.tick();
			underTest.fillTank();
		}
		boolean isAlive = underTest.getIsAlive();
		assertThat(isAlive, is(true));
	}

}
