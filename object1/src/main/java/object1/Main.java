package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Person newPerson1 = new Person("Doe John",30, 150);
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");
        System.out.prntln (newPerson1.height);
    }
}
