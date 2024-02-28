package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Person newPerson1 = new Person("Abukar", "Abukar");
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");    }
}
