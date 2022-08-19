package 다형성;

class Person{
    public void print(){
        System.out.println("Person print");
    }
}

class Student extends Person {
    public void print(){
        System.out.println("Student.print");
    }

    public void print2(){
        System.out.println("Student.print2");
    }
}

class CollegeStudent extends Person {
    public void print(){
        System.out.println("CollegeStudent.print");
    }
}

public class Main {
    public static void main(String[] args) {

        // 다형성
        Person p1 = new Person();
        Person p2 = new Student();

        // 자식이 부모 객체 가리키는 것은 안된다.
        //Student s2 = new Peson();

        // 타입 변환
        p1.print();
        p2.print();

        Person pp1 = null;
        Student ss1 = null;

        Person pp2 = new Person();
        Student ss2 = new Student();
        Person pp3 = new Student(); // Person으로 업캐스팅

        pp1 = pp2;
        pp1 = ss2;

        ss1 = ss2;
        //ss1 = pp2;

        ss1 = (Student)pp3; // 다운캐스팅

        CollegeStudent cc1;
        CollegeStudent cc2 = new CollegeStudent();
        // 자식 -> 부모클래스로의 형변환은 불가능

        //p2.print2(); -> 불가능하다
        //타입이 알고 있는 부분만 출력이 가능하다

        Person p3 = new CollegeStudent();
        p3.print();


        // instanceof
        Person pe1 = new Person();
        Student st1 = new Student();
        Person pe2 = new Student();
        Person pe3 = new CollegeStudent();

        System.out.println(pe1 instanceof Person);
        System.out.println(pe1 instanceof Student);

        System.out.println(st1 instanceof Student);
        System.out.println(st1 instanceof Person);

        System.out.println(pe2 instanceof Person);
        System.out.println(pe2 instanceof Student);

        System.out.println(pe3 instanceof Person);
        System.out.println(pe3 instanceof CollegeStudent);

        // instance를 검사해서 형변환
        if(pe1 instanceof Student){
            Student stu1 = (Student) pe1;
        }
    }
}
