package 변수와자료형_3;

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello World!";
        String s2 = "01234";

        // equals
        String s3 = "Hi";
        String s4 = "Hi";

        System.out.println(s3.equals(s4));
        System.out.println(s3 == s4);

        String s5 = new String("Hi");

        System.out.println(s3.equals(s5));
        System.out.println(s3 == s5);

        // indexOf
        String s6 = "Hello! World";
        System.out.println(s6.indexOf("!"));
        System.out.println(s6.indexOf("!",s6.indexOf("!")+1));

        // replace
        String s7 = s6.replace("Hello","Bye");
        System.out.println("s7="+s7);

        // substring
        System.out.println(s7.substring(0,3));
        System.out.println(s7.substring(0,s7.indexOf("!")+1));

        // toUpperCase
        System.out.println(s7.toUpperCase());

        // StringBuffer - 데이터 변경이 빈번히 발생할 때 사용
        // 데이터가 변경이 되어도 객체를 새로 만들지 않는다.
        StringBuffer sb1 = new StringBuffer();
        sb1.append("01234");
        System.out.println(sb1);
        sb1.append("56789");
        System.out.println(sb1);

        String a = "012345";
        String b = "56789";

        a += b;
        System.out.println(a);


        //배열

        int[] myArray1 = {1,2,3,4,5};
        // 인덱스 : 0부터 시작
        System.out.println(myArray1[0]);
        System.out.println(myArray1[1]);
        System.out.println(myArray1[2]);
        System.out.println(myArray1[3]);
        System.out.println(myArray1[4]);

        char[] myArray2 = {'a','b','c','d'};
        System.out.println(myArray2[2]);

        String[] myArray3 = new String[3];
        myArray3[0] = "Hello";
        myArray3[1] = " ";
        myArray3[2] = "World";

        System.out.println(myArray3[0] + myArray3[1] + myArray3[2]);
    }
}
