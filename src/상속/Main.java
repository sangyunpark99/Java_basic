package 상속;

class Person {
    String name;
    int age;
    public int a1;
    private int a2;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}


class Student extends Person {
    String name;
    int stdId;

    Student(String name, int age, int stdId){
//        this.name = name;
//        super.name = name;
        super(name,stdId);
        this.age = age;
        this.stdId = stdId;
    }

    public void printInfo(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("stdId: " + stdId);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("상윤",20,12312);
        s1.name = "a";
        s1.age = 25;
        s1.printInfo();
    }
}
