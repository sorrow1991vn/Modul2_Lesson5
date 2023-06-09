package Lesson5.Accessmodifier;

public class Circle {
    private final double radius = 1.0;
    private String color = "red";
    Circle(){
    }
    protected double getRad(){
        return radius;
    }
    protected double getArea(){
        return radius*radius*Math.PI;
    }
}
