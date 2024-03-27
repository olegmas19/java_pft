package ru.stqa.pft.sandbox;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
        public static double distance(Point p1, Point p2) {
            double xDiff = p2.getX() - p1.getX();
            double yDiff = p2.getY() - p1.getY();
            return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
        }
    public double distanceTo(Point otherPoint) {
        double xDiff = otherPoint.getX() - this.x;
        double yDiff = otherPoint.getY() - this.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
    public static void main(String[] args) {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(4, 5);

        double distance = point1.distanceTo(point2);
        System.out.println("Distance between points: " + distance);
    }
}
