package animals;
import java.util.Comparator;


public class CompareByClassAndAge implements Comparator<Animal> {


    @Override
    public int compare(Animal o1, Animal o2) {
        return  Comparator.comparing(Animal::getClass1)
                .thenComparing(Animal::getAge)
                .compare(o1, o2);
    }
}
