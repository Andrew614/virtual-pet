import static org.junit.Assert.assertEquals;

import org.junit.Test;

import org.wecancodeit.VirtualPet;

public class VirtualPetTest {

    @Test
    public void shouldTick() {
        VirtualPet pet = new VirtualPet("Kendrick");

        int initialHunger = pet.getHunger();
        pet.tick();
        int hungerAfterTick = pet.getHunger();

        assertEquals(initialHunger + 10, hungerAfterTick);
    }
}