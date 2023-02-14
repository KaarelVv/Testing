package animal;

import practice.Color;
// mODEL VLASSES
public class Dog {

    private String name;
    private Integer age;
    // "M" "F"
    private Gender gender;
    private String race;
    private Integer weight;

    private Color color;

    //All args constructor

    // Less String the better!

    public Dog(String name,Integer age,Gender gender, String race, Integer weight, Color color){

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
        this.color = color;
    }


    public Dog Dog(String gender, String race){

        return new Dog("Sparky",1,Gender.M,race,1,color.BROWN);

    }

    public Integer getAge() {

        return age;
    }

    public void setAge(Integer age) {
        if (age<=0){
            System.out.println("Dog cannot have 0 or lower age!!!Use values bigger than 0");
            return;
        }
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        if (weight<=0){
            System.out.println("Dog cannot have 0 or lower weight!!!Use values bigger than 0");
            return;
        }
        this.weight = weight;
    }


}
