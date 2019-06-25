package io.zipcoder;

import java.util.*;

public class AskForPets {

    private List<Pet> pets;
    private Integer numOfPets;
    private Scanner in;

    public AskForPets() {
        pets = new LinkedList<>();
        numOfPets = 0;
        in = new Scanner(System.in);
    }

    public void ask() {

        howMany();
        typeOfPet();
        printPets();
        System.out.println("Here are your pets in species order");
        sort();
        printPets();
        System.out.println("Here are your pets in species/name order");
        sortByName();
        printPets();

    }

    public void howMany() {
        while(numOfPets <= 0) {
            System.out.println("How many pets do you have?");
            numOfPets = in.nextInt();
            if(numOfPets <= 0) {
                System.out.println("Err: Invalid number. \nPlease use a valid number.");
            }
            else {
                System.out.println();
            }
        }
    }

    public void typeOfPet() {
        while(pets.size() < numOfPets) {
            System.out.println("Do you have a Dog, Cat or Parrot?");
            String type = in.next();
            in.nextLine();
            type = type.toUpperCase();

            System.out.println("What's their name?");
            String name = in.nextLine();

            switch(type) {
                case "CAT":
                    pets.add(PetFactory.createCat(name));
                    break;
                case "DOG":
                    pets.add(PetFactory.createDog(name));
                    break;
                case "PARROT":
                    pets.add(PetFactory.createParrot(name));
                    break;
                default:
                    System.out.println("Err: Invalid Type\n Try a different pet.");
            }
            System.out.println();
            if(pets.size() < numOfPets) System.out.println("You have another pet!");
        }

    }

    protected void printPets() {

        System.out.println("Here's a list of your Pets:\n");

        for(int i = 0; i < pets.size(); i++) {
            System.out.printf("Pet #%d: %s the %s\n",
                    i + 1,
                    pets.get(i).getName(),
                    pets.get(i).getSpecies()
            );
            System.out.printf("%s says %s!\n", pets.get(i).getName(), pets.get(i).speak());
        }
    }

    protected void sort() {
        Collections.sort(pets);
    }

    protected void sortByName() {
        Comparator<Pet> nameComparator = new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                int compare = o1.species.compareTo(o2.species);

                if(compare == 0) {
                    return o1.name.compareTo(o2.name);
                }
                else {
                    return compare;
                }
            }
        };

        pets.sort(nameComparator);
    }
}
