package week8homework2.q20_poolarea;

public class Rectangle {


    double width;
    double length;
    public Rectangle(double width, double length) {

        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (width < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

        public double getWidth() {
            return width;
        }

        public double getLength() {
            return length;
        }

        public double getArea(){
        return width * length;




    }



}
