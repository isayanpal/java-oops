package Intro;

class Pen { //example 1
    // properties
    String color;
    String type; //ballpoint; gel

    //methods
    public void write(){ // method
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student { //example 2
    String name;;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // unparameterised constructor
    Student(){

    }

    // parameterised constructor
//    Student(String name, int age){
//        this.name = name;
//        this.age = age;
//    }

    // copy constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();

        // unparameterised constructor
//        Student s1 = new Student();
//        s1.name = "Sayan";
//        s1.age = 22;

        // parameterised constructor
//        Student s1 = new Student("Sayan", 22);

        // copy constructor
        Student s1 = new Student();
        s1.name = "Ram";
        s1.age = 25;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}

