package 변수와자료형_1;

public class Main {
    public static void main(String[] args) {
        // 1. 변수 사용
        int age = 10;
        System.out.println(age);


        // 2. 변수 이름 규칙

        // 문자, 숫자ㅏ, _(underscore), $ 사용 가능

        int apple = 2000;
        int apple3 = 2000;
        int _apple = 2000;
        int $apple = 2000;

        // 숫자로 시작 x

        // 대소문자 구분
        int apople5 = 1000;
        int Apple5 = 1000;

        // 공백 사용 x
        int one_apple = 1000;

        // 예약어 사용 x

        // 한글 사용 가능
        int 사과  = 1000;
        System.out.println("사과 " + 사과);

        // 3. 표기법

        // 카멜 표기법
        // 변수, 함수

        int myAge = 10;

        //파스칼 표기법
        // 클래스

        int MyAge = 10;
        int OneApplePrice = 1000;

        //스네이크 표기법
        //사용 x

        int my_age = 10;

    }
}
