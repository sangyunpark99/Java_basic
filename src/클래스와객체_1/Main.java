package 클래스와객체_1;

// car

class Car{
    String name;
    String type;

    public void printCarInfo(){
        System.out.println("name = " + name);
        System.out.println("type = " + type);
    }

    public void move(){
        System.out.println("이동");
    }

    public void breaker(){
        System.out.println("정지!");
    }
}

// car 2

class Car2 {
    String name;
    String type;

    Car2(String name, String type){
        this.name = name;
        this.type = type;
        System.out.println("생성자 호출");
    }


    public void load(){
        System.out.println("짐을 주세요!");
    }

    public void horn(){
        System.out.println("빵빵!");
    }
}

public class Main {
    public static void main(String[] args) {

        Car myCar1 = new Car();

        myCar1.name = "a";
        myCar1.type = "suv";
        myCar1.printCarInfo();
        myCar1.move();
        myCar1.breaker();

        Car2 myCar2 = new Car2("람보르기니","sportscar");
        System.out.println(myCar2.name);
        System.out.println(myCar2.type);
        myCar2.load();
        myCar2.horn();
    }
}
