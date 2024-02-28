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

public class Chair {
    private String material;
    private String color;
    private int legs;

    public Chair(String material, String color, int legs) {
        this.material = material;
        this.color = color;
        this.legs = legs;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
