import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Virtual Pets Amok");
		System.out.println("Enter a pet name");
		String petName = input.nextLine();
		
		VirtualPet firstPet = new VirtualPet(petName);
		VirtualPetShelter shelter = new VirtualPetShelter();
		shelter.addVitrtualPetToShelter(firstPet);
		System.out.println("Enter a pet name");
		petName = input.nextLine();
		VirtualPet secondPet = new VirtualPet(petName);
		shelter.addVitrtualPetToShelter(secondPet);
		System.out.println(shelter.getPet(firstPet.getName()));
		firstPet.tick();
		
		shelter.printStatus();
	}

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
