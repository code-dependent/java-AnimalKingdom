package animalKingdom;

public class Bird extends Animals{

    public Bird(String name, int yearNamed){
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
    @Override
    public String toString(){
        return name +" "+ reproduce() +" "+ move() +" "+ breathe() +" "+ yearNamed;
    }

}