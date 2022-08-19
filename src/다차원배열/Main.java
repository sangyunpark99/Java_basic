package 다차원배열;

public class Main {
    public static void main(String[] args) {
        // 일차원 배열

        int[] myArray = {1,2,3};

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        for (int i : myArray){
            System.out.println(i);
        }

        System.out.println();

        // 이차원 배열
        int [][] myArray2 = {{1,2,3,},{4,5,6}};

        for (int i = 0; i < myArray2.length; i++) {
            // 행의 갯수
            for (int j = 0; j < myArray2[i].length; j++) {
                // 열의 갯수
                System.out.println(myArray2[i][j]);
            }
        }

        System.out.println();
        //
        for(int[] ints:myArray2){
            for(int item:ints){
                System.out.println(item);
            }
        }


        //
        int [][] testArray1 = {{0,0,0},{0,0,0},{0,0,0}};

        for (int i = 0; i < testArray1.length ; i++) {
            for (int j = 0; j < testArray1[i].length; j++) {

                if(i == j){
                    testArray1[i][j] = 10;
                    continue;
                }

                testArray1[i][j] = 1;


            }
        }

        for(int[] row : testArray1){
            for(int column : row){
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
