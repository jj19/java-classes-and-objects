//        1. Create a Pet Class with the following instance variables:
//
//        name (PRIVATE)
//        age (PRIVATE)
//        location (PRIVATE)
//        type (PRIVATE)
//        two constructors(empty, all attributes)
//        Code to be able to access the following (Get Methods):
//        name, age, type
//        Code to be able to change (Set Methods):
//        name, age, location


public class Pet {

    private String Name;
    private int Age;
    private String Location;
    private String Type;

    public Pet(String Name, int Age, String Location, String Type) {
        this.Name = Name;
        this.Age = Age;
        this.Location = Location;
        this.Type = Type;
    }
    public Pet() {
        Name = "Ben";
        Age = 2;
        Location = "Arizona";
        Type = "Rescue";

    }

    public String getName(){
        return Name;
    }

    public int getAge() {
     return Age;
    }

    public String getType() {
        return Type;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setAge(int age) {
       this.Age = age;
    }

    public void setLocation(String location) {
        this.Location = location;
    }

    }

