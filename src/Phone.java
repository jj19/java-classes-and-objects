//        2. Create a Custom Class (anything you want - car, phone, holiday, etc.).
//
//        Requirements:
//
//        Minimum 3 private instance variables
//        An empty constructor
//        A constructor that uses only 2 of your 3 variables
//        A constructor that uses all 3 of your instance variables
//        Get methods for all 3 of your instance variables and Set methods for all 3 of your instance variables
//        A method that returns a Boolean
//        A method that returns a String (For example, if I created a Santa Custom Class, my code would look something like the attached Santa.java file.
public class Phone {
    private String Make;
    private String Model;
    private int yearReleased;

    public Phone(){

    }
    public Phone (String make, int year ){
        this.Make = make;
        this.yearReleased = year;
    }
    public Phone (String make, String model, int year){
        this.Make = make;
        this.Model = model;
        this.yearReleased = year;
    }

    public String getMake() {
        return Make;
    }
    public String getModel() {
        return Model;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setMake(String make) {
        Make = make;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public boolean canUpgrade(){
        return this.yearReleased > 2021;
    }
    public  String activateDevice(){
        return "Device is now activated";
    }
}
