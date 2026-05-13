package model;

import java.time.LocalDate;
import java.util.Date;

public class Mammal extends Animal{

    boolean carnivore;
    int legs;

    public Mammal(String name, String species, LocalDate dateOfBirth, Habitat habitat, boolean carnivore, int legs){
        super(name,species,dateOfBirth,habitat);
        this.carnivore=carnivore;
        this.legs=legs;
    }

    public boolean isCarnivore() {
        return carnivore;
    }

    public void setCarnivore(boolean carnivore) {
        this.carnivore = carnivore;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return super.toString()+"is carnivore: "+isCarnivore()+", has "+getLegs()+" legs";
    }
}
