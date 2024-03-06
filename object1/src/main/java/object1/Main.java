package object1;

import java.util.logging.Logger;

public class Main {


    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person person = new Person( "Name", 7);

        Chair chair = new Chair("wood", "Dark coffee",4);

        Dog dog = new Dog( "Lacy", 5, "Buldog");


        Car car = new Car("Honda", "Odisey" , 2018, 20000);

        System.out.println(person.height);
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println("Material:" +chair.getMaterial() + "\n " + "Color:" + chair.getColor()  + " \n" + "Legs:" + chair.getLegs());
        System.out.println("Name:" +dog.getName() + "\n " + "Age:" + dog.getAge() + " \n" + "Breed:" +dog.getBreed());
        System.out.println("Make:" +car.getMake() + "\n " + "Model:" +car.getModel() + " \n" +"Year:" +car.getYear() + " \n" +"Mileage:" +car.getMileage());



    }
}
