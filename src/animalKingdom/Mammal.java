package animalKingdom;

public class Mammal extends Animals{

    public Mammal(String name, int yearNamed){
        super(name, yearNamed);
    }

    @Override
    public String move(){
        return "Walk";
    }
    @Override
    public String breathe(){
        return "Lungs";
    }
    @Override
    public String reproduce(){
        return "Live Birth";
    }

}