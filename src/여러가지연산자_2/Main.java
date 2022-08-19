package 여러가지연산자_2;

public class Main {
    public static void main(String[] args) {
        // AND 연산자

        int num1 = 5;
        int num2 = 3;
        int num3 = 0;
        int result = 0;

        result = num1 & num2;
        System.out.println(result);
        System.out.println(Integer.toBinaryString(num1));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));


        // OR 연산자

        result = num1 | num2;
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));


        // XOR 연산자

        result = num1 ^ num2;

        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));

        // 반전 연산자
        num1 = 5;

        result = ~num1;

        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%s\n", Integer.toBinaryString(result));



        //비트 이동 연산자

        // <<
        int numA = 3;
        result = numA << 1;

        System.out.println(result);
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(numA)));
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(result)));

        // >>

        result = numA >> 1;

        System.out.println(result);
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(numA)));
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(result)));


        // >>>

        numA = -5;
        result = numA >> 1;
        System.out.printf("%s\n",Integer.toBinaryString(numA));
        System.out.printf("%s\n",Integer.toBinaryString(result));

        result = numA >>> 1;
        System.out.printf("%s\n",Integer.toBinaryString(numA));
        System.out.printf("%s\n",Integer.toBinaryString(result));

    }
}
