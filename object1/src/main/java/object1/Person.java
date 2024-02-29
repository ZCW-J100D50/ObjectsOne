package object1;

// Define a class
public class Person {
    // Define Instance Variables
    // different for each object!

    String name;
    int age = 0;
    int height = 0; // height is in "centimeters"

    public Person(){}

    // Constructor
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // Getter
    public String getName() {
        return this.name;
    }

    // Setter
    public void setName(String name)
    {
        this.name = name;
    }
    // Getter
    public int getAge() {
        return this.age;
    }

    // Setter
    public void setAge(int age)
    {
        this.age = age;
    }

    // Getter
    public int getHeight() {
        return this.height;
    }

    // Setter
    public void setHeight(int height)
    {
        this.height = height;
    }

    public static void main(String[] args) {
        // Declare and initialize an object
        Person person1 = new Person();
        person1.setHeight(160);
        System.out.println(person1.getHeight());

        Car car1 = new Car("Toyota" , "Camry", 2020, 0);
        System.out.println(car1.getMake() + "," + car1.getModel() + "," + car1.getMileage() + "," + car1.getYear());

        Chair chair = new Chair("Leather", "Brown", 4);
        System.out.println(chair.getLegs() + "," + chair.getColor() + "," + chair.getMaterial());

        Dog dog1 = new Dog("Fido", 5, "Golden Retriever");
        System.out.println(dog1.getName() + " is a " + dog1.getBreed() + ".");

        Person[] people = new Person[5];
        people[0] = new Person("John", 30, 160);
        people[1] = new Person("Jane", 25, 170);
        people[2] = new Person("Jim", 35, 180);
        people[3] = new Person("Jill", 40, 190);
        people[4] = new Person("Jack", 45, 200);

        Car[] cars = new Car[5];
        cars[0] = new Car("Toyota", "Camry", 2020, 0);
        cars[1] = new Car("Honda", "Civic", 2019, 5000);
        cars[2] = new Car("Ford", "Mustang", 2018, 10000);
        cars[3] = new Car("Chevrolet", "Corvette", 2021, 15000);
        cars[4] = new Car("Tesla", "Model S", 2022, 20000);

        Dog[] dogs = new Dog[5];
        dogs[0] = new Dog("Buddy", 3, "Golden Retriever");
        dogs[1] = new Dog("Max", 5, "Labrador Retriever");
        dogs[2] = new Dog("Lucy", 2, "Poodle");
        dogs[3] = new Dog("Daisy", 4, "Bulldog");
        dogs[4] = new Dog("Rocky", 6, "German Shepherd");

        Chair[] chairs = new Chair[5];
        chairs[0] = new Chair("Leather", "Brown", 4);
        chairs[1] = new Chair("Fabric", "White", 4);
        chairs[2] = new Chair("Wood", "Brown", 4);
        chairs[3] = new Chair("Metal", "Black", 4);
        chairs[4] = new Chair("Plastic", "White", 4);

    //    int[] numbers = {1, 2, 3, 4, 5};
    //    string[] words = {"one", "two", "three", "four", "five"};

      //  int fourthnumber = numbers[3];

       // string fourthword = words[3];

   }

    }

