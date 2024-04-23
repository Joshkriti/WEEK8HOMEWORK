package week8homework.question_5;

public class Sub_Class_Motorcycle extends Vehicle_Baseclass {

    public static void main(String[] args) {
        Vehicle();  // calling from vehicle baseclass
        make1("Honda");
        model("Activa" ,125);
        year(2023);
        fueltype1("Petrol");


    }

    public static void make1(String make1 ){
        System.out.println("This motorcycle brand name is " + make1);
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
