// Define a class
class Person {
    // Define Instance Variables
    // different for each object!
    // height is in "centimeters"
    String name;
    int age = 0;
    int height = 0;

    // Constructor
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        // Declare and initialize an object
        Person person1 = new Person("John", 30, 160);

    /* Now you can use the Object `person1` */
        
    }
}
