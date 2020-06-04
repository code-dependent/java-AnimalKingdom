package animalKingdom;

public class Main{
    public static void main(String[] args){
        System.out.println("*** Hello World ***");

        Mammal mammal1 = new Mammal("Panda", 1869);
        Mammal mammal2 = new Mammal("Zegra", 1778);
        Mammal mammal3 = new Mammal("Koala", 1816);
        Mammal mammal4 = new Mammal("Sloth", 1804);
        Mammal mammal5 = new Mammal("Armadillo", 1758);
        Mammal mammal6 = new Mammal("Raccoon", 1778);
        Mammal mammal7 = new Mammal("Bigfoot", 2021);

        Bird bird1 = new Bird("Pigeon", 1837);
        Bird bird2 = new Bird("Peacock", 1821);
        Bird bird3 = new Bird("Toucan", 1758);
        Bird bird4 = new Bird("Parrot", 1824);
        Bird bird5 = new Bird("Swan", 1758);

        Fish fish1 = new Fish("Salmon", 1758);
        Fish fish2 = new Fish("Catfish", 1817);
        Fish fish3 = new Fish("Perch", 1758);

        System.out.println(fish1 +" "+ fish1.getId());
    }
}