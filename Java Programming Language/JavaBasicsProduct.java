import java.util.Scanner;

public class JavaBasicsProduct {
    public static void main(String args[]){

        try (//input
        Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the value of a");
            int a = sc.nextInt();
            System.out.println("enter the value of b");
            int b = sc.nextInt();

            //product
            int product = a * b;

            //print product
            System.out.println("product is "+product);
        }
    }
}
