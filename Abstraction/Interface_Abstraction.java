package Abstraction;

interface Animal1 {
    void walk();
}

interface Herbivore {
    void eats();
}

// multiple inheritance , not multi level inheritance
class Horse1 implements Animal1, Herbivore {
    public void walk(){
        System.out.println("walks on 4 legs");
    }
    public void eats(){
        System.out.println("eats grass");
    }
}

public class Interface_Abstraction {
    public static void main(String[] args) {
        Horse1 horse = new Horse1();
        horse.walk();
        horse.eats();
    }
}
