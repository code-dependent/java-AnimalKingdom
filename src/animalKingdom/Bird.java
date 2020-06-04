package animalKingdom;

public class Bird extends Animals{

    public Bird(String name, int yearNamed){
        super(name, yearNamed);
    }
   
    @Override
    public String move(){
        return "Fly";
    }
    @Override
    public String breathe(){
        return "Lungs";
    }
    @Override
    public String reproduce(){
        return "Eggs";
    }

}