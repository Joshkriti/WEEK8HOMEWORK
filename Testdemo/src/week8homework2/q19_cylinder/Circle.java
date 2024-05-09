package week8homework2.q19_cylinder;

public class Circle {

    double radius;

    public Circle(double radium) {
        if (radium < 0) {
            this.radius = 0;
        } else {
            this.radius = radium;
        }
    }

    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }



}
