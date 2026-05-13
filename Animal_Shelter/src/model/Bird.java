package model;

import java.time.LocalDate;
import java.util.Date;

public class Bird extends Animal {
    boolean ableToFly;
    int wingspan;

    public Bird(String name, String species, LocalDate dateOfBirth, Habitat habitat, boolean ableToFly, int wingspan) {
        super(name, species, dateOfBirth, habitat);
        this.ableToFly = ableToFly;
        this.wingspan = wingspan;
    }

    public boolean isAbleToFly() {
        return ableToFly;
    }

    public void setAbleToFly(boolean ableToFly) {
        this.ableToFly = ableToFly;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public String toString() {
        return super.toString()+"can fly: "+isAbleToFly()+", wingspan: "+getWingspan()+" cm ";
    }
}
