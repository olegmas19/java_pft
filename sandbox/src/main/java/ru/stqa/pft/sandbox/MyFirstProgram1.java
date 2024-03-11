package ru.stqa.pft.sandbox;

public class MyFirstProgram1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Hello("World");
        double NotArea = area(2.0);
    }

    public static void Hello(String str){
        System.out.println("Hello," +" "+ str + "!");
    }

    public static double area(double q){
        return q * q;
    }
}