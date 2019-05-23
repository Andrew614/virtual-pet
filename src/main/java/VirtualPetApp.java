import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Virtual Pets Amok");
		System.out.println("Enter your first pet's name");
		String petName = input.nextLine();

		VirtualPet firstPet = new VirtualPet(petName);
		VirtualPetShelter shelter1 = new VirtualPetShelter();
		shelter1.addVitrtualPetToShelter(firstPet);

		menu(input, firstPet);

	}
	
	/*private static void newMenu(Scanner input, VirtualPetShelter shelter1) {
		String userChoice = "";
		//output a table of pets for users to choose from
		System.out.println("Press 1 to interact with pets");
		System.out.println("Press 2 to add a pet to the shelter");
		System.out.println("Press 3 to remove a pet from the shelter");
		userChoice = input.nextLine();
		switch (userChoice) {
		case "1":
			System.out.println(shelter1.printAllPets());
			System.out.println("Select one of ^these^ pets to interact with. Press Enter again when finished.");
			do {
				
			}while();
			break;
		case "2":
			break;
		case "3":
			break;
			
	}*/

	private static void menu(Scanner input, VirtualPet firstPet) {
		String userChoice = "";
		do {
			System.out.println("Enter 1 to feed " + firstPet.getName());
			System.out.println("Enter 2 to play with " + firstPet.getName());
			System.out.println("Enter 9 to quit game");
			userChoice = input.nextLine();

			firstPet.tick();

			switch (userChoice) {
			case "1":
				firstPet.feed();
				System.out.println("Your pet's hunger level is " + firstPet.getHunger());
				System.out.println("Your pet's thirst level is " + firstPet.getThirst() + "\n");
				break;
			
			case "2":
				firstPet.play();
				System.out.println("Your pet's boredom level is " + firstPet.getBoredom() + "\n");
				break;

			case "9":
				break;
				
			}
			System.out.println(firstPet.getName() + "'s hunger level is: " + firstPet.getHunger());
			System.out.println(firstPet.getName() + "'s thirst level is: " + firstPet.getThirst());
			System.out.println(firstPet.getName() + "'s boredom level is: " + firstPet.getBoredom() + "\n");

		} while (!userChoice.equals("9"));

		System.out.println("Thanks for playing!");
	}

}
