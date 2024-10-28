import java.util.Scanner;

public class javaAdvanced2DArrays {
    /* 
    public static void main(String[] args) {
        
        //creating new 2D array
        int matrix[][] = new int[3][3];
        
        //rows and columns in the 2D array
        int rows = matrix.length;
        int cols = matrix[0].length;

        //input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter values of 2D array matrix");
        for(int i=0; i < rows; i++){
            for(int j=0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        System.out.println("your 2D matrix is as follows:");
        for(int i=0; i < rows; i++){
            for(int j=0; j < cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    */

    //Spiral Matrix
   
    public static void printSpiralMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            // Traverse right
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Traverse down
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Traverse left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Traverse up
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        System.out.println("Spiral Matrix:");
        printSpiralMatrix(matrix);
        // Output: Spiral Matrix:
        //         1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6 7 8 9 14 19 18 17 12 13
    }
    
    
}
