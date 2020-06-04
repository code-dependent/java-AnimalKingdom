package animalKingdom;

public class Mammal extends Animals{

    public Mammal(String name, int yearNamed){
        super(name, yearNamed);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getYear(){
        return name;
    }
    public void setYear(int year){
        this.yearNamed = year;
    }
    public int getId(){
        return id;
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
    @Override
    public String toString(){
        return name +" "+ reproduce() +" "+ move() +" "+ breathe() +" "+ yearNamed;
    }

}