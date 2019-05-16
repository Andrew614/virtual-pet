import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a pet name");
		String petName = input.nextLine();

		VirtualPet firstPet = new VirtualPet(petName);

		System.out.println("Your pet is named " + firstPet.getName());
		System.out.println("Your pet's hunger level is " + firstPet.getHunger());
		System.out.println("Your pet's thirst level is " + firstPet.getThirst());
		System.out.println("Your pet's boredom level is " + firstPet.getBoredom());

		// for (int i = 0; i < ((int) (Math.random() * 10)); i++) {
		firstPet.feed();
		System.out.println("Your pet appreciates the food and water. Hunger and thirst have decreased.");
		// }
		// for (int j = 0; j < ((int) (Math.random() * 10)); j++) {
		firstPet.play();
		System.out.println("Your pet has tons of fun and is less bored.");
		// System.out.println(j);
		// }
		// for (int l = 0; l < ((int) (Math.random() * 100)); l++) {
		firstPet.tick();
		System.out.println("Some time has passed, and your pet's hunger, thirst, and boredom have increased.");
		// }

		System.out.println("Your pet's hunger level is " + firstPet.getHunger());
		System.out.println("Your pet's thirst level is " + firstPet.getThirst());
		System.out.println("Your pet's boredom level is " + firstPet.getBoredom());

	}

}
