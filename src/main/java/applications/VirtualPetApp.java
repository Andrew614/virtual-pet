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
				System.out.print(shelter1.printAllPets());
				System.out.println("Select which pet you would like to interact with.");
				userChoice = inputScanner.nextLine();
				String petType = shelter1.getPetType(shelter1.getPet(userChoice));
				shelter1.addToSelectedPets(shelter1.getPet(userChoice));
				if (petType.equals("OrganicPet")) {
					System.out.println("Enter \"1\" to walk the pet \n" + "Enter \"2\" to feed the pet \n"
							+ "Enter \"3\" to clean the pet \n" + "Enter \"4\" to play with the pet \n");
					String activity = inputScanner.nextLine();
					if (activity.equals("1") || activity.equals("4")) {
						do {
							System.out.println("Would you like to interact with other pets? yes/no");
							userChoice = inputScanner.nextLine().toLowerCase();
							if (userChoice.equals("yes") && shelter1.getShelterSize() > 0) {
								System.out.print(shelter1.printAllPets());
								System.out.println("Select which pet you would like to interact with.");
								userChoice = inputScanner.nextLine();
								shelter1.addToSelectedPets(shelter1.getPet(userChoice));
							}
						} while (userChoice.equals("yes")||shelter1.getShelterSize()==0);
					}
					if (activity.equals("2") || activity.equals("3")){
						do {
							System.out.println("Would you like to interact with other pets? yes/no");
							userChoice = inputScanner.nextLine().toLowerCase();
							if (userChoice.equals("yes") && shelter1.hasOrganic()) {
								System.out.print(shelter1.printOrganicPets());
								System.out.println("Select which pet you would like to interact with.");
								userChoice = inputScanner.nextLine();
								shelter1.addToSelectedPets(shelter1.getPet(userChoice));
							}
							
						} while (userChoice.equals("yes")&&shelter1.hasOrganic());
					}
					switch (activity) {
					case "1":
						shelter1.walkAllPets();
						System.out.println("You walk your pet(s) arount the block");
						break;
					case "2":
						shelter1.feedAllPets();
						System.out.println("Your pet(s) gobble up the food");
						break;
					case "3":
						shelter1.cleanAllPets();
						System.out.println("Your pet's litter box is clean");
						break;
					case "4":
						shelter1.playWithAllPets();
						System.out.println("You play with your pet(s)");
						break;
					default:
						System.out.println("Please Enter a valid Menu option!");
					}
				} else if (petType.equals("RoboticPet")) {
					System.out.println("Enter \"1\" to walk the pet \n" + "Enter \"2\" to refuel the pet \n"
							+ "Enter \"3\" to repair the pet \n" + "Enter \"4\" to play with the pet \n");
					String activity = inputScanner.nextLine();
					if (activity.equals("1") || activity.equals("4")) {
						do {
							System.out.println("Would you like to interact with other pets? yes/no");
							userChoice = inputScanner.nextLine().toLowerCase();
							if (userChoice.equals("yes") && shelter1.getShelterSize() > 0) {
								System.out.print(shelter1.printAllPets());
								System.out.println("Select which pet you would like to interact with.");
								userChoice = inputScanner.nextLine();
								shelter1.addToSelectedPets(shelter1.getPet(userChoice));
							}
						} while (userChoice.equals("yes")||shelter1.getShelterSize()==0);
					}
					if (activity.equals("2") || activity.equals("3")){
						do {
							System.out.println("Would you like to interact with other pets? yes/no");
							userChoice = inputScanner.nextLine().toLowerCase();
							if (userChoice.equals("yes") && shelter1.hasRobotic()) {
								System.out.print(shelter1.printRoboticPets());
								System.out.println("Select which pet you would like to interact with.");
								userChoice = inputScanner.nextLine();
								shelter1.addToSelectedPets(shelter1.getPet(userChoice));
							}
							
						} while (userChoice.equals("yes")&&shelter1.hasRobotic());
					}
					switch (activity) {
					case "1":
						shelter1.walkAllPets();
						System.out.println("You walk your pet(s) arount the block");

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
				shelter1.returnPetsToShelter();
				break;

			case "9":
				exitMenu = true;

			default:
				System.out.println("Please Enter a valid Menu option!");
			}
		} while (!exitMenu);
		System.out.println("Out of the do while loop");

	}
}
