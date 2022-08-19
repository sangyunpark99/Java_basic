package 클래스와객체_2;

import 클래스와객체_2.car.Car2;

class Car{
    String name;
    String type;

    Car(String name, String type){
        this.name = name;
        this.type = type;
    }

    public void printCarInfo(){
        System.out.println("name = " + name);
        System.out.println("type = " + type);
    }

   public void printCarInfo(String date){
       this.printCarInfo();
       System.out.println("date : " + date);
   }

   public void printCarInfo(int number){
        this.printCarInfo();
       System.out.println("number : " + number);
   }

   public void printCarInfo(String date, int number){
        this.printCarInfo();
       System.out.println("date : " + date);
       System.out.println("number" + number);
   }
}

class Car3 {
    static String name = "None"; // 객체끼리 데이터를 공유한다.
    String type;

    Car3(String name, String type){
        this.name = name;
        this.type = type;
    }

    public void printCarInfo(){
        System.out.println("name : " + name);
        System.out.println("type : " + type);
    }

    public static void getName(){
        System.out.println("Car name:" + name);
    }
}


public class Main {
    public static void main(String[] args) {
        Car myCar1 = new Car("a", "sedan");
        myCar1.printCarInfo();

        // 오버로딩
        myCar1.printCarInfo("2002");
        myCar1.printCarInfo(1234);
        myCar1.printCarInfo("2022",1234);

        // 접근 제어자

        Car2 myCar2 = new Car2("a","b","c","d");
        System.out.println(myCar2.name1);
//        System.out.println(myCar2.name2);
//        System.out.println(myCar2.name3);
//        System.out.println(myCar2.name4);

        // Static
        Car3.getName();
        Car3 myCar3_1 = new Car3("a","sedan");
        Car3 myCar3_2 = new Car3("b","suv");
        Car3 myCar3_3 = new Car3("c","rv");

        myCar3_1.printCarInfo();
        myCar3_2.printCarInfo();
        myCar3_3.printCarInfo();

    }
}
