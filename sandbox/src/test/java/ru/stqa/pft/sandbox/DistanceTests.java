package ru.stqa.pft.sandbox;

import static ru.stqa.pft.sandbox.Point.distance;

public class DistanceTests{
        public static void main(String[] args) {
            Point point1 = new Point(6, 1);
            Point point2 = new Point(4, 5);

            double distance = distance(point1, point2);
            System.out.println("Дистанция между точками: " + distance);

    }
}