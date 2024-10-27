import java.util.Scanner;

public class javaAdvanced2DArrays {
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
}
