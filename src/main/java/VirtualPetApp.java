import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Virtual Pets Amok");
		System.out.println("Enter a pet name");
		String petName = input.nextLine();

		VirtualPet firstPet = new VirtualPet(petName);
		VirtualPetShelter shelter = new VirtualPetShelter();
		shelter.addVitrtualPetToShelter(firstPet);

		firstMenu(input, shelter);
		//secondMenu();

	}

	public static void firstMenu(Scanner input, VirtualPetShelter shelter) {
		System.out.println("Your pet has been added to the shelter." + arrayToTable(shelter.petNamesAndStats()));
	}

	private static String arrayToTable(String[][] arr) {
		String table = "";
		table += "\n"+makeTableEntry("Name")+makeTableEntry("Hunger")+makeTableEntry("Thirst")+makeTableEntry("Boredom")+makeTableEntry("Age")+"\n";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				table += makeTableEntry(arr[i][j]);
			}
			table += "\n";
		}
		return table;
	}


	private static String makeTableEntry(String str) {
		String dashes = "";
		for (int i = 0; i < 10 - Math.floor(str.length() / 2); i++) {
			dashes += "-";
		}
		if (str.length() % 2 == 1) {
			return "|" + dashes + str + dashes + "-|";
		}
		return "|" + dashes + str + dashes +"|";

	}

	/*
	 * private static void menu(Scanner input, VirtualPet firstPet) { String
	 * userChoice = ""; do { System.out.println("Enter 1 to feed " +
	 * firstPet.getName()); System.out.println("Enter 2 to play with " +
	 * firstPet.getName()); System.out.println("Enter 9 to quit game"); userChoice =
	 * input.nextLine();
	 * 
	 * firstPet.tick();
	 * 
	 * switch (userChoice) { case "1": firstPet.feed();
	 * System.out.println("Your pet's hunger level is " + firstPet.getHunger());
	 * System.out.println("Your pet's thirst level is " + firstPet.getThirst() +
	 * "\n"); break;
	 * 
	 * case "2": firstPet.play(); System.out.println("Your pet's boredom level is "
	 * + firstPet.getBoredom() + "\n"); break;
	 * 
	 * case "9": break;
	 * 
	 * } System.out.println(firstPet.getName() + "'s hunger level is: " +
	 * firstPet.getHunger()); System.out.println(firstPet.getName() +
	 * "'s thirst level is: " + firstPet.getThirst());
	 * System.out.println(firstPet.getName() + "'s boredom level is: " +
	 * firstPet.getBoredom() + "\n");
	 * 
	 * } while (!userChoice.equals("9"));
	 * 
	 * System.out.println("Thanks for playing!"); }
	 */

}
