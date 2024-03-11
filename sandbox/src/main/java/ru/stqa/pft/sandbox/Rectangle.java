package ru.stqa.pft.sandbox;

public class Rectangle {

    public double l;
    public double b;

    public Rectangle(double l, double b){
        this.l = l;
        this.b = b;
    }
    public double area(){
        return this.l * this.b;
    }
}
