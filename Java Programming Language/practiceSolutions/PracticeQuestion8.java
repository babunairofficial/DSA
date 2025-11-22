public class PracticeQuestion8 {
    public static void main(String[] args) {

        /* 
        // Question 1
        int[][] array = { {4, 7, 8}, {8, 8, 7} };

        int countOf7 = 0;
        for(int i=0; i<array.length; i++) {
            for(int j=0; j < array[0].length; j++) {
                if(array[i][j] == 7) {
                    countOf7++;
                }
            }
        }
        System.out.println( "count of 7 is : " + countOf7);
        */

        /* 
        // Question 2
        int[][] nums = { {1,4,9}, {11,4,3}, {2,2,3} };
        int sum = 0;

        // sum of 2nd row elements
        for(int j = 0; j < nums[0].length; j++) {
            sum += nums[1][j];
        }

        System.out.println("sum is : " + sum);
        */


        //Question 3
        int row = 2;
        int col = 3;

        int [][] matrix = { {2, 3, 7}, {5, 6, 7} };

        //Display original matrix
        printMatrix(matrix);

        //Transpose the matrix 
        int[][] transpose = new int[col][row];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        //print the transposed matrix
        printMatrix(transpose);
    }
    public static void printMatrix(int[][] matrix) {
        System.out.println("The matix is : ");
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
