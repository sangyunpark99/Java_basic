package 클래스와객체_2.car;

public class Car2 {
    public String name1; // 외부에서 접근
    private String name2;
    protected String name3; // 상속받은 클래스에서만 사요이 가능
    String name4;


    public Car2(String name1, String name2, String name3, String name4){
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
    }
}
