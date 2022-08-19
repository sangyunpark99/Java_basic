package 클래스와객체_1;

class Animal{
    String name;
    Double weight;
    String claasification;

    Animal(String name, double weight, String classification){
        this.name = name;
        this.weight = weight;
        this.claasification = classification;
    }

    public void printInfo(){
        System.out.println("name = " + name);
        System.out.println("weight = " + weight);
        System.out.println("classification =" + claasification);
    }

    public void eat(){
        System.out.println("냠냠!");
    }

    public void sleep(){
        System.out.println("쿨쿨!");
    }

    public void walk(){
        System.out.println("걷기!");
    }

    public void run(){
        System.out.println("뛰기!");
    }
}

public class Practice {
    public static void main(String[] args) {

        Animal animal1 = new Animal("강아지",10.0,"시츄");
        animal1.printInfo();

    }
}
