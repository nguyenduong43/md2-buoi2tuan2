package Dongvat;

public class AnimalList {
//    private Animal[] animals=new Animal[5];
//    private int index=0;
//    public void add(Animal animal){
//        animals[index]=animal;
//        System.out.println(animal+"add at "+index);
//        index++;
//    }
//    public Animal get(int index){
//        return animals[index];
//    }
    private Animal[] animals=new Animal[10];
    private int index=0;
    public void add(Animal animal) {
        animals[index]=animal;
        index++;
    }
    public Animal get(int index) {
        return animals[index];
    }

}

