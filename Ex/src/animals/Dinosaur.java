package animals;


import java.util.Random;
import java.util.stream.Collectors;



public class Dinosaur extends Animal {
    static String symbols = "ArGhHou";
    static String random = new Random().ints(5, 0, symbols.length())
            .mapToObj(symbols::charAt)
            .map(Object::toString)
            .collect(Collectors.joining());

    public Dinosaur(String class1,String name, int age, String say, boolean domesticated, int averageLifeSpan) {

        super(class1,name, age, say = Dinosaur.random , domesticated, averageLifeSpan);



    }
}
