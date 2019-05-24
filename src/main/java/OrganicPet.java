
public class OrganicPet extends VirtualPet{
	private int hunger = 10;
	private int thirst = 10;
	public OrganicPet(String name) {
		super(name);
	
	}
	public void feed() {

		hunger -= 10;
		thirst -= 10;
		if (hunger < 0) {
			hunger = 0;
		}
		if (thirst < 0) {
			thirst = 0;
		}
	}


}