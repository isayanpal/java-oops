package Abstraction;

abstract class Animal {
    abstract public void walk();
    public void eat(){
        System.out.println("Animal Eats");
    }
}
class Horse extends Animal {
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal {
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}
public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }
}
