package ru.stqa.pft.sandbox;

public class MyFirstProgram1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        hello("World");
        Square s = new Square(5);
        Rectangle r = new Rectangle(4,6);
        System.out.println(s.area());
        System.out.println(r.area());
    }

    public static void hello(String str){
        System.out.println("Hello," +" "+ str + "!");
    }


}