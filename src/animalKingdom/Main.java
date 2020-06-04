package animalKingdom;

import java.util.*;

public class Main{
    public static void showAnimal(ArrayList<Animals> animals, Evaluator checker){
        for(Animals animal : animals){
            if(checker.check(animal)){
                System.out.println(animal);
            }
        }
    }
    public static void main(String[] args){
        System.out.println("*** Hello World ***");

        Mammal mammal1 = new Mammal("Panda", 1869);
        Mammal mammal2 = new Mammal("Zegra", 1778);
        Mammal mammal3 = new Mammal("Koala", 1816);
        Mammal mammal4 = new Mammal("Sloth", 1804);
        Mammal mammal5 = new Mammal("Armadillo", 1758);
        Mammal mammal6 = new Mammal("Raccoon", 1758);
        Mammal mammal7 = new Mammal("Bigfoot", 2021);

        Bird bird1 = new Bird("Pigeon", 1837);
        Bird bird2 = new Bird("Peacock", 1821);
        Bird bird3 = new Bird("Toucan", 1758);
        Bird bird4 = new Bird("Parrot", 1824);
        Bird bird5 = new Bird("Swan", 1758);

        Fish fish1 = new Fish("Salmon", 1758);
        Fish fish2 = new Fish("Catfish", 1817);
        Fish fish3 = new Fish("Perch", 1758);

        ArrayList<Animals> allAnimals = new ArrayList<>();

        allAnimals.add(mammal1);
        allAnimals.add(mammal2);
        allAnimals.add(mammal3);
        allAnimals.add(mammal4);
        allAnimals.add(mammal5);
        allAnimals.add(mammal6);
        allAnimals.add(mammal7);
        allAnimals.add(bird1);
        allAnimals.add(bird2);
        allAnimals.add(bird3);
        allAnimals.add(bird4);
        allAnimals.add(bird5);
        allAnimals.add(fish1);
        allAnimals.add(fish2);
        allAnimals.add(fish3);
        
        System.out.println("\n*** Printing animals by discovery year ***");
        allAnimals.sort((animal1, animal2) -> animal1.getYear() - animal2.getYear());
        allAnimals.forEach(animal -> System.out.println("Animals{ id= " + animal.getId() +" name= "+ animal.getName() +" yearNamed= "+ animal.getYear()));

        System.out.println("\n*** List all the animals order by how they move ***");
        allAnimals.sort((animal1, animal2) -> animal1.getName().compareToIgnoreCase(animal2.getName()));
        allAnimals.forEach(animal -> System.out.println("Animals{ id= " + animal.getId() +" name= "+ animal.getName() +" yearNamed= "+ animal.getYear()));
        
        System.out.println("\n*** List all the animals alphabetically ***");
        allAnimals.sort((animal1, animal2) -> animal1.move().compareToIgnoreCase(animal2.move()));
        allAnimals.forEach(animal -> System.out.println("Animals{ id= " + animal.getId() +" name= "+ animal.getName() +" yearNamed= "+ animal.getYear()));

        System.out.println("\n*** List only those animals the breath with lungs ***");
        showAnimal(allAnimals, animal -> animal.breathe()=="Lungs");

        System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
        showAnimal(allAnimals, animal -> animal.breathe()=="Lungs" && animal.getYear()==(1758));

        System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
        showAnimal(allAnimals, animal -> animal.reproduce()=="Eggs" && animal.breathe()=="Lungs");

        System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
        allAnimals.sort((animal1, animal2) -> animal1.getName().compareToIgnoreCase(animal2.getName()));
        showAnimal(allAnimals, animal -> animal.getYear()==1758);

        




    }
}