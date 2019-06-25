package io.zipcoder;



public abstract class Pet implements Comparable<Pet> {

    protected String name;
    protected String species;

    public Pet() {
        name = "no name set";
        species = "no species set";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract String speak();

    public String getSpecies() {
        return species;
    }

    public int compareTo(Pet pet) {
        int compare = name.compareTo(pet.name);

        if(compare == 0) {
            return species.compareTo(pet.species);
        }
        else {
            return compare;
        }
    }
}
