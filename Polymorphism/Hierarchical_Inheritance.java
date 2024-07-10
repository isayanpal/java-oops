package Polymorphism;

class Shape3 {
    public void area(){
        System.out.println("displays color");
    }
}

class Triangle3 extends Shape3{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape3{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
public class Hierarchical_Inheritance {
}
