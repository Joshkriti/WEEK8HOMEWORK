package week8homework.question_1;

public class Sub_class_Q1 extends Codebuster_Q1 {

    public static void main(String[] args) {
        Sub_class_Q1 S = new Sub_class_Q1();
        S.codebustorGroups();
        S.groupName();

    }

    @Override
    public void groupName() {
        System.out.println("Code2");
    }

    public void codebustorGroups(){
        System.out.println("Code1, Code2, Code3");
    }

}
