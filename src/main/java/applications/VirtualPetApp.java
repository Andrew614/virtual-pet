package applications;

import java.util.Scanner;

import models.VirtualPetShelter;
import organicPets.OrganicCat;
import organicPets.OrganicDog;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		VirtualPetShelter shelter1 = new VirtualPetShelter();

		System.out.println("Welcome to Virtual Pet!");
		System.out.println("Enter 1 to create a Pet");
		System.out.println("Enter 2 Interact with Pet");
		System.out.println("Enter 3 to Remove Pet");
		System.out.println("Enter 9 to Exit");
		String userChoice = inputScanner.nextLine();

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
					shelter1.addVitrtualPetToShelter(cat); //End of Case 1
				}
			}
			if (userChoice.equals("2")) {
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
					shelter1.addVitrtualPetToShelter(cat);
				}
			}
			break;

		default:
			System.out.println("Please Enter a valid Menu option!");
		}

	}
}
