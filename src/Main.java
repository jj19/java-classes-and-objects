
public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("Ben", 2, "New York", "Rescue");

        System.out.println(dog.getAge());

        dog.setAge(3);

        System.out.println(dog.getAge());

        Phone iphone = new Phone("Apple", "iPhone 14 Pro Max", 2022);

        System.out.println(iphone.activateDevice());
        System.out.println(iphone.getMake());
        System.out.println(iphone.getYearReleased());
    }
}
