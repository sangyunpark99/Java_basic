package 조건문;

public class Main {
    public static void main(String[] args) {
        // if
        int num = 99;

        if(num >= 100){
            System.out.println("적습니다");
        } else {
            System.out.println("100보다 작습니다");
        }

        int score = 90;
        char grade = 0;

        if(score >= 90){
            grade = 'A';
        }else if(grade>=80){
            grade = 'B';
        }else if (grade>70){
            grade = 'c';
        }else{
            grade = 'F';
        }

        System.out.println(grade);

        // switch

        String fruit = "apple";

        switch(fruit){
            case "apple":
                System.out.println(fruit + "은 5000원 입니다");
                break;
            case "watermelon":
                System.out.println(fruit + "은 10000원 입니디ㅏ");
                break;
            default:
                System.out.println("둘다 아닙니다");
                break;
        }

        // 홀,짝 판단 코드

        int number = 5;

        if(number%2 == 0){
            System.out.println("짝수 입니다!");
        }else {
            System.out.println("홀수 입니다1");
        }

        // switch

        score = 80;
        grade = 0;

        // switch는 조건문이 아니다! case가 아니면 default로 넘어가서 실행된다.
        // 10으로 나눠주는 방식으로 하면 딱딱 떨어진다.
        switch(score/10){
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }

        System.out.println("grade: " + grade);
    }
}
