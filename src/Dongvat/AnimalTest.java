package Dongvat;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalList list = new AnimalList();
        list.add(new Dog());
        list.add(new Cat());
        Animal a=list.get(0);
        a.roam();
        if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.chaseCat();
        }
    }
}
