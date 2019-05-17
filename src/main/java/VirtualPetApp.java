import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a pet name");
		String petName = input.nextLine();

		VirtualPet firstPet = new VirtualPet(petName);
		menu(input, firstPet);

		System.out.println("Your pet is named " + firstPet.getName());
		System.out.println("Your pet's hunger level is " + firstPet.getHunger());
		System.out.println("Your pet's thirst level is " + firstPet.getThirst());
		System.out.println("Your pet's boredom level is " + firstPet.getBoredom());

		firstPet.feed();
		System.out.println("Your pet appreciates the food and water. Hunger and thirst have decreased.");

		firstPet.play();
		System.out.println("Your pet has tons of fun and is less bored.");

		firstPet.tick();
		System.out.println("Some time has passed, and your pet's hunger, thirst, and boredom have increased.");



	}

	private static void menu(Scanner input, VirtualPet firstPet) {
		String userChoice = "";
		do {
			System.out.println("Enter 1 to play with " + firstPet.getName());
			System.out.println("Enter 2 to feed " + firstPet.getName());
			System.out.println("Enter 3 to get the hunger level for " + firstPet.getName());
			System.out.println("Enter 4 to get the boredom level for " + firstPet.getName());
			System.out.println("Enter 5 to get the thrist level for " + firstPet.getName());
			System.out.println("Enter 9 to quit game");
			userChoice = input.nextLine();
			
			switch (userChoice){
			case "1":
				firstPet.play();
			case "2":
				firstPet.feed();
			case "3":
				firstPet.getHunger();
			case "4":
				firstPet.getBoredom();
			case "5":
				firstPet.getThirst();
			case "9":
				break;
			}
			
		} while (!userChoice.equals("9"));
	}

}
