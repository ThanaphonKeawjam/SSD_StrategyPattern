package Question2;

import java.util.Comparator;

public class DogType implements Comparator<Dog> {

    public int compare(Dog o1, Dog o2) {
        return o1.getName().length() - o2.getName().length();
    }
}
