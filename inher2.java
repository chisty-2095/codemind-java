class Person {
    String name;
    int age;
    char gender;
}
class Student extends Person {
    String branch;
    String college;
    int studentID;
}
class Trainer extends Person {
    int empID;
    double salary;
}
class Intern extends Student {
    int InternID;
    double salary;
}
public class inher2 {
    public static void main(String[] args) {
        Intern i1 = new Intern();
        System.out.println(i1 instanceof Intern);
        System.out.println(i1 instanceof Student);
        System.out.println(i1 instanceof Person);
    }
}
