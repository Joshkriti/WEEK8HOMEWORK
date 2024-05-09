package week8homework2.q19_cylinder;

public class Cylinder extends Circle{


    @Override
    public double getRadius() {
        return super.getRadius();
    }
    double height;

    public Cylinder(double radium, double height) {
        super(radium);

        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return height * getArea();
    }



}

