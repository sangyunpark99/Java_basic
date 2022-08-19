package 상속;

class Animal{
    String desc;
    Animal(String desc){
        this.desc = desc;
    }

    public void printInfo(){
        System.out.println(this.desc);
    }
}

class Cat extends Animal {
    String desc;
    Cat(){
        super("고양이 입니다");
    }
}

public class Practice2 {
    public static void main(String[] args) {
        // Test code

        Cat cat = new Cat();
        cat.printInfo();
    }
}
