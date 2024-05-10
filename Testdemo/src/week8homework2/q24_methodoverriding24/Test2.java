package week8homework2.q24_methodoverriding24;

public class Test2 {

    public static void main(String[] args) {

        SBI s = new SBI();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());

        ICICI i = new ICICI();
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());

        AXIS a = new AXIS();
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());

    }
}
