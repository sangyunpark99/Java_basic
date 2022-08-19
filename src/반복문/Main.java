package 반복문;

public class Main {
    public static void main(String[] args) {
        // 반복문 - for

        for(int i = 0; i < 5; i++){
            System.out.println("i : " + i);
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for(int i = 0; i < 5; i++){

            // 2일때 다음으로 넘어가기
            if(i == 2){
                continue;
            }

            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for(int i = 0; i < 5; i++){

            if(i == 2){
                break;
            }

            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        int[] nums = {1,2,3,4,5};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }


        // foreach
        System.out.println();
        for(int num: nums){
            System.out.println(num);
        }

        // while
        System.out.println();

        int i = 0;

        // continue
        while(i<5){

            if (i == 2){
                i++;
                continue;
            }

            System.out.println(i++);
        }

        System.out.println();

        i = 0;
        //break
        while(i<5){

            if (i == 2){
                i++;
                break;
            }

            System.out.println(i++);
        }

        // do-while
        System.out.println();
        boolean knock = false;

        do{
            System.out.println("knock");
        } while (knock);


        // 과제 1
        // 내 방법
        for (i = 0; i < 4; i++) {
            for(int j = 0; j < 2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 풀이
        for (i = 0; i < 8; i++) {
            if(i%2 == 0){
                continue;
            }

            for(int k = 0; k < i; i++){
                System.out.println("*");
            }
            System.out.println();
        }

        // 과제 2
        int waterTemperature = 0;

        while(waterTemperature<100){
            waterTemperature++;


            // if(waterTemperature % 10 == 0){
            //  System.out.println(waterTemperature + "도 입니다.");
            // }

            switch (waterTemperature){
                case 10:
                    System.out.println("10도");
                    break;
                case 20:
                    System.out.println("20도");
                    break;
                case 30:
                    System.out.println("30도");
                    break;
                case 40:
                    System.out.println("40도");
                    break;
                case 50:
                    System.out.println("50도");
                    break;
                case 60:
                    System.out.println("60도");
                    break;
                case 70:
                    System.out.println("70도");
                    break;
                case 80:
                    System.out.println("80도");
                    break;
                case 90:
                    System.out.println("90도");
                    break;

            }

        }

    }
}
