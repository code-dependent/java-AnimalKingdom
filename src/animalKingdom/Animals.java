package animalKingdom;

abstract class Animals{
    private static int maxId = 0;
    protected String name;
    protected int id;
    protected int yearNamed;

    public void eats(){
        System.out.println("Eating");
    }
    public Animals(String name, int yearNamed){
        maxId++;
        this.id = maxId;
        this.name = name;
        this.yearNamed = yearNamed;
    }
    abstract String move();
    abstract String breathe();
    abstract String reproduce();
}