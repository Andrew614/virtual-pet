package applications;

import java.util.ArrayList;
import java.util.Scanner;

import models.VirtualPet;
import models.VirtualPetShelter;
import organicPets.OrganicCat;
import organicPets.OrganicDog;
import roboticPets.RoboticCat;
import roboticPets.RoboticDog;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		VirtualPetShelter shelter1 = new VirtualPetShelter();
		String userChoice;
		boolean exitMenu = false;

		System.out.println("Welcome to Virtual Pet!");
		do {
			shelter1.clearPetArraylists();
			shelter1.tickAllPets();
			shelter1.organicPrintStatus();
			shelter1.roboticPrintStatus();
			System.out.println("Enter 1 to create a Pet");
			System.out.println("Enter 2 Interact with Pet");
			System.out.println("Enter 3 to Remove Pet");
			System.out.println("Enter 9 to Exit");
			userChoice = inputScanner.nextLine();
			switch (userChoice) {
			case "1":
				System.out.println("Enter 1 to create an Organic Pet.");
				System.out.println("Enter 2 to create an Robotic Pet.");
				userChoice = inputScanner.nextLine();
				if (userChoice.equals("1")) {
					System.out.println("Enter 1 to create a Dog.");
					System.out.println("Enter 2 to create a Cat.");
					userChoice = inputScanner.nextLine();
					if (userChoice.equals("1")) {
						System.out.println("Please enter a name for your Dog");
						userChoice = inputScanner.nextLine();
						OrganicDog dog = new OrganicDog(userChoice);
						shelter1.addVitrtualPetToShelter(dog);

					}
					if (userChoice.equals("2")) {
						System.out.println("Please enter a name for your Cat");
						userChoice = inputScanner.nextLine();
						OrganicCat cat = new OrganicCat(userChoice);
						shelter1.addVitrtualPetToShelter(cat); // End of Case 1
					}
				}
				if (userChoice.equals("2")) {
					System.out.println("Enter 1 to create a Dog.");
					System.out.println("Enter 2 to create a Cat.");
					userChoice = inputScanner.nextLine();

					if (userChoice.equals("1")) {
						System.out.println("Please enter a name for your Dog");
						userChoice = inputScanner.nextLine();
						RoboticDog dog = new RoboticDog(userChoice);
						shelter1.addVitrtualPetToShelter(dog);

					}
					if (userChoice.equals("2")) {
						System.out.println("Please enter a name for your Cat");
						userChoice = inputScanner.nextLine();
						RoboticCat cat = new RoboticCat(userChoice);
						shelter1.addVitrtualPetToShelter(cat);
					}
				}
				break;
			case "2":
				shelter1.fillPetsNotYetSelected();
				System.out.print(shelter1.printPetsNotSelected());
				if(shelter1.getShelterSize()>0) {
					System.out.println("Select which pet you would like to interact with.");
				}else System.out.println("You have no pets! Why don't you make one?");
				userChoice = inputScanner.nextLine();
				String petType = shelter1.getPetType(shelter1.getPet(userChoice));
				shelter1.addToSelectedPets(shelter1.getPet(userChoice));
				if (petType.equals("OrganicPet")) {
					System.out.println("Enter \"1\" to walk the pet \n" + "Enter \"2\" to feed the pet \n"
							+ "Enter \"3\" to clean the pet \n" + "Enter \"4\" to play with the pet \n");
					String activity = inputScanner.nextLine();
					if ((activity.equals("1") || activity.equals("4"))) {
						addMorePets(inputScanner, shelter1);
					}
					if ((activity.equals("2") || activity.equals("3"))) {
						addMoreOrganicPets(inputScanner, shelter1);
					}
					switch (activity) {
					case "1":
						shelter1.walkAllPets();
						System.out.println("You walked your pet(s) around the block");
						break;
					case "2":
						shelter1.feedAllPets();
						System.out.println("Your pet(s) gobbled up the food");
						break;
					case "3":
						shelter1.cleanAllPets();
						System.out.println("Your pet's litter box/cage is clean");
						break;
					case "4":
						shelter1.playWithAllPets();
						System.out.println("You played with your pet(s)");
						break;
					default:
						System.out.println("Please Enter a valid Menu option!");
					}
				} else if (petType.equals("RoboticPet")) {
					System.out.println("Enter \"1\" to walk the pet \n" + "Enter \"2\" to refuel the pet \n"
							+ "Enter \"3\" to repair the pet \n" + "Enter \"4\" to play with the pet \n");
					String activity = inputScanner.nextLine();
					if ((activity.equals("1") || activity.equals("4"))) {
						addMorePets(inputScanner, shelter1);
					}
					if ((activity.equals("2") || activity.equals("3"))) {
						addMoreRoboticPets(inputScanner, shelter1);
					}
					switch (activity) {
					case "1":
						shelter1.walkAllPets();
						System.out.println("You walk your pet(s) around the block");

						break;
					case "2":
						shelter1.fuelAllPets();
						System.out.println("Your pet(s) are now refueled");
						break;
					case "3":
						shelter1.repairAllPets();
						System.out.println("Your pet(s) are repaired");
						break;
					case "4":
						shelter1.playWithAllPets();
						System.out.println("You play with your pet(s)");
						break;
					default:
						System.out.println("Please Enter a valid Menu option!");
					}
				}

				break;
			case "3":
				System.out.println(shelter1.printAllPets());
				System.out.println("Select a pet to remove");
				String petToRemove = inputScanner.nextLine();
				if (shelter1.shelterContainsName(petToRemove)) {
					shelter1.removeVirtualPetFromShelter(shelter1.getPet(petToRemove));
					System.out.println(petToRemove + " has been adopted.");
				} else {
					System.out.println("Please enter the name of a pet in your shelter");
				}
				break;

			case "9":
				exitMenu = true;
				break;
			default:
				System.out.println("Please Enter a valid Menu option!");
			}

		} while (!exitMenu);
		System.out.println("Thank you for playing. Bye Bye!");
	}

	public static void addMorePets(Scanner inputScanner, VirtualPetShelter shelter1) {
		String continueLoop = "yes";
		String userChoice;
		while (continueLoop.equals("yes") && shelter1.getPetsNotSelectedSize() > 0) {
			System.out.println("Would you like to interact with other pets? yes/no");
			continueLoop = inputScanner.nextLine().toLowerCase();
			if (continueLoop.equals("yes") && shelter1.getPetsNotSelectedSize() > 0) {
				System.out.print(shelter1.printPetsNotSelected());
				System.out.println("Select which pet you would like to interact with.");
				userChoice = inputScanner.nextLine();
				shelter1.addToSelectedPets(shelter1.getPet(userChoice));
			}
		}
	}

	public static void addMoreOrganicPets(Scanner inputScanner, VirtualPetShelter shelter1) {
		String continueLoop = "yes";
		String userChoice;
		while (continueLoop.equals("yes") && shelter1.hasOrganic()) {
			System.out.println("Would you like to interact with other pets? yes/no");
			continueLoop = inputScanner.nextLine().toLowerCase();
			if (continueLoop.equals("yes") && shelter1.hasOrganic()) {
				System.out.print(shelter1.printOrganicPetsNotSelected());
				System.out.println("Select which pet you would like to interact with.");
				userChoice = inputScanner.nextLine();
				shelter1.addToSelectedPets(shelter1.getPet(userChoice));
			}
		}
	}

	public static void addMoreRoboticPets(Scanner inputScanner, VirtualPetShelter shelter1) {
		String continueLoop = "yes";
		String userChoice;
		while (continueLoop.equals("yes") && shelter1.hasRobotic()) {
			System.out.println("Would you like to interact with other pets? yes/no");
			continueLoop = inputScanner.nextLine().toLowerCase();
			if (continueLoop.equals("yes") && shelter1.hasRobotic()) {
				System.out.print(shelter1.printRoboticPetsNotSelected());
				System.out.println("Select which pet you would like to interact with.");
				userChoice = inputScanner.nextLine();
				shelter1.addToSelectedPets(shelter1.getPet(userChoice));
			}
		}
	}

}
