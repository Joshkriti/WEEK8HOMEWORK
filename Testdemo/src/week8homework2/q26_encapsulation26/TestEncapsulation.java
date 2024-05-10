package week8homework2.q26_encapsulation26;

public class TestEncapsulation {

    public static void main(String[] args) {

        Encapsulate e = new Encapsulate();
        e.setName("Komal");
        System.out.println("Name: " + e.getName());

        e.setRollNo(25);
        System.out.println("Roll Number: " + e.getRollNo());

        e.setAge(26);
        System.out.println("Age: " + e.getAge());
    }

}
