package 여러가지연산자_1;

public class Main {
    public static void main(String[] args) {
        // 대입 연산자
        int num = 10;
        num =+ 10;
        num = 10;
        num -= 10;

        // 산술 연산자
        int numX = 10;
        int numY = 3;
        int result = 0;

        result = numX + numY;
        result = numX - numY;
        result = numX * numY;
        result = numX / numY;
        result = numX % numY;

        int numZ = 1;
        System.out.println(numZ++); // 출력 후 증가
        System.out.println(numZ);
        System.out.println(++numZ);

        numZ = 1;
        System.out.println(numZ--);
        System.out.println(numZ);
        System.out.println(--numZ);

        // 관계 연산자

        int numA = 10;
        int numB = 9;

        System.out.println(numA > numB);
        System.out.println(numB < numA);
        System.out.println(numA == numB);
        System.out.println(numA != numB);

        // 논리 연산자

        System.out.println((10>9)&&(1==0));
        System.out.println((10>9)||(1==0));

        // 복합 대입 연산자
        int num1 = 10;
        int num2 = 5;
        num1+= num2;
        //num1 = num1 + num2;

        System.out.println("num1 = " + num1);

        num1 -= num2;
        num1 *= num2;

        // 삼항 연산자
        int a = 100;
        String aResult = a == 100 ? "Yes" : "No";
        System.out.println(aResult);
    }
}
