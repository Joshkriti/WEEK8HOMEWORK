package week8homework.question_5;

public class Sub_Class_Car extends Vehicle_Baseclass {
    // Each subclass should have
    //properties such as make, model, year, and fuel type.

    public static void main(String[] args) {
        Vehicle();  // Calling from Vehicle
        make("Hyundai");
        model("I30");
        year(2020);
        fueltype("Diesel");

    }

    public static void make(String make ){
        System.out.println("This car brand name is " + make);
    }
    public static void model(String model ){
        System.out.println("This car model is " + model);
    }
    public static void year(int year){
        System.out.println("This car made in " + year);
    }
    public static void fueltype(String fualtype){
        System.out.println("This car fuel type is " + fualtype);
    }

}
