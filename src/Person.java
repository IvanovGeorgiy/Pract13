public class Person {
    String name;
    String surname;
    String ot;
    public Person(String name, String surname, String ot){
        this.name = name;
        this.surname =  surname;
        this.ot = ot;
    }
    public String  getName(){
        if (ot.isEmpty() && name.isEmpty()){ return surname;}
        else if (ot.isEmpty()){ return surname + " " + name.toUpperCase().charAt(0) + ".";}
        else { return surname + " " + ot.toUpperCase().charAt(0) + ".";}
    }
}
