package week8homework2;

public class Q25_Constructor_Students5 {

    int id;
    String name;
    int age;

    public Q25_Constructor_Students5(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Q25_Constructor_Students5(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("ID number: " + id + "  Name: " + name + "  Age: " + age);
    }

    public static void main(String[] args) {
        Q25_Constructor_Students5 s = new Q25_Constructor_Students5(25, "Lina");
        Q25_Constructor_Students5 s1 = new Q25_Constructor_Students5(26, "Maya", 25);
        s.display();
        s1.display();
    }



}
