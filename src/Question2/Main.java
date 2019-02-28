package Question2;

public class Main {

    public static void main(String[] args) {
        Integer[] num = {10, 9, 8, 7};
        String[] str = {"c", "b", "o", "p", "A"};
        Dog[] dog = { new Dog("Bob"),
                    new Dog("Nana"),
                    new Dog("A"),
                    new Dog("Ghost")};
        Sort s = new Sort();
        s.sort(num, new IntType()); // sort number
        System.out.println("================");
        s.sort(str, new StringType()); // sort string
        System.out.println("================");
        s.sort(dog, new DogType()); // sort name length of dog
    }

}
