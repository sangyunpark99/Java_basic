package 다형성;

class Car{
    Car(){}

    public void horn(){
        System.out.println("빵빵!");
    }
}

class FireTruck extends Car {
    public void horn() {
        System.out.println("위이잉!");
    }
}

class Ambulance extends Car {
    public void horn() {
        System.out.println("삐뽀삐뽀!");
    }
}

public class Practice {
    public static void main(String[] args) {
        Car car = new Car();
        car.horn();

        car = new FireTruck();
        car.horn();

        car = new Ambulance();
        car.horn();


        //다형성으로 인해서 배열로 만들어서 for문으로 한번에 출력이 가능하다.
        Car car3[] = {new Car(), new FireTruck(), new Ambulance()};

        for(Car item: car3){
            item.horn();
        }
    }

}
