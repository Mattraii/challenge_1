import model.Animal;
import model.Bird;
import model.Habitat;
import model.Mammal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
                List<Animal> animals = new ArrayList<Animal>();

                animals.add(new Mammal("Simba", "Lion", LocalDate.of(2018, 3, 15), Habitat.OUDOOR, true, 4));
                animals.add(new Bird("Tweety", "Canary", LocalDate.of(2021, 9, 5), Habitat.INDOOR, true, 25));
                animals.add(new Mammal("Dumbo", "Elephant", LocalDate.of(2010, 11, 22), Habitat.OUDOOR, false, 4));
                animals.add(new Bird("Pingu", "Pengüin", LocalDate.of(2019, 2, 14), Habitat.OUDOOR, false, 45));
                animals.add(new Mammal("Luna", "Dolphin", LocalDate.of(2015, 4, 7), Habitat.AQUATIC, true, 0));
                animals.add(new Animal("Rex", "Komodo dragon", LocalDate.of(2015, 8, 8), Habitat.OUDOOR));

                List<Animal> mammals = new ArrayList<Animal>();
                List<Animal> birds = new ArrayList<Animal>();

                sortAnimals(animals, mammals, birds);
                describeAnimals(birds,mammals);


        }

        private static void describeAnimals(List<Animal> birds, List<Animal> mammals) {
                for (Animal animal: mammals){
                        System.out.println(animal);
                }
                for (Animal animal: birds){
                        System.out.println(animal);
                }
        }

        private static void sortAnimals(List<Animal> animals, List<Animal> mammals, List<Animal> birds) {
                for (Animal animal: animals){
                        if(animal instanceof  Mammal){
                                System.out.println("The animal Named "+animal.getName()+" has been added to the list of mammals");
                                mammals.add(animal);
                        }
                        else if(animal instanceof Bird){
                                birds.add(animal);
                        }
                        else{
                                System.out.println("the animal "+animal.getName()+" does not belong to any animal group because it's type is: "+animal.getSpecies() );
                        }
                }
        }

}
