import java.util.Scanner;

public class javaAdvancedFunctionsMethods {
    public static void introduce(){
        System.out.println("Hello");
        System.out.println("I am Babu");
        System.out.println("I love java programming");
    }
    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        introduce();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();

        int sum = calculateSum(a, b); //this sum is different from the sum in calculateSum function
        System.out.println("the sum is "+sum);
        sc.close();

    }
}
