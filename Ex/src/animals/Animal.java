package animals;

public class Animal {


    private String class1;
    private String name;
    private int age;
    private String say;
    private boolean domesticated;
    private int averageLifeSpan;


    public Animal(String class1, String name, int age, String say, boolean domesticated, int averageLifeSpan) {
        this.class1 = class1;
        this.name = name;
        this.age = age;
        this.say = say;
        this.domesticated = domesticated;
        this.averageLifeSpan = averageLifeSpan;
    }
    public String getClass1() {
        return class1;
    }

    public void setClass1(String name) {
        this.class1 = class1;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    public boolean isDomesticated() {
        return domesticated;
    }

    public void setDomesticated(boolean domesticated) {
        this.domesticated = domesticated;
    }

    public int getAverageLifeSpan() {
        return averageLifeSpan;
    }

    public void setAverageLifeSpan(int averageLifeSpan) {
        this.averageLifeSpan = averageLifeSpan;
    }



    @Override
    public String toString() {
        return "Class: "+ class1 + " Name: " + name + " Age: " + age +  " Sound: " + say +  " Domesticated: " + domesticated
                 + " AverageLifeSpan: " + averageLifeSpan;

    }
}
