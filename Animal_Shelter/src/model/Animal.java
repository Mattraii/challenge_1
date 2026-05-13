package model;

import javax.swing.plaf.DesktopPaneUI;
import java.time.LocalDate;
import java.util.Date;

public class Animal {
    String name;
    String species;
    LocalDate dateOfBirth;
    Habitat habitat;

    public Animal(String name, String species, LocalDate dateOfBirth, Habitat habitat){
        this.name=name;
        this.species= species;
        this.dateOfBirth=dateOfBirth;
        this.habitat=habitat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate ddateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return (getName()+" ("+getSpecies()+") was born on "+getDateOfBirth()+" lives in an "+getHabitat().toString()+" habitat, ");
    }
}
