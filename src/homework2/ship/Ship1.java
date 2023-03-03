package homework2.ship;
//        Create an object Ship with fields: name, color, engineType, age
//        Create a stream of 5 instances of the Ship object
//        a) Sort ship by name.
//        b) Print only ships of orange color
//        c) Print all ship names

public class Ship1 {
    private String name;
    private String color;
    private String engineType;
    private int age;

    public Ship1(String name, String color, String engineType, int age) {
        this.name = name;
        this.color = color;
        this.engineType = engineType;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getAge() {
        return age;
    }
}


