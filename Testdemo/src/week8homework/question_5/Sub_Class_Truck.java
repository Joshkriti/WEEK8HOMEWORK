package week8homework.question_5;

public class Sub_Class_Truck extends Vehicle_Baseclass{

    public static void main(String[] args){
        Vehicle(); // Calling from vehicle base class
        make("Volvo");
        model("FH", 12);
        year(2018);
        fueltype1("Diesel");

    }
    public static void make(String make ){
        System.out.println("This motorcycle brand name is " + make);
    }
    public static void model(String model, int model1 ){
        System.out.println("This motorcycle model is " + model);
    }
    public static void year(int year){
        System.out.println("This motorcycle made in " + year);
    }
    public static void fueltype1(String fualtype1){
        System.out.println("This motorcycle fuel type is " + fualtype1);
    }
}
