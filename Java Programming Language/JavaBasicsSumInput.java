import java.util.*;

public class JavaBasicsSumInput {
    public static void main(String args[]){
        try (//input
        Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the value of a ");
            int a = sc.nextInt();
            System.out.println("enter the value of b ");
            int b = sc.nextInt();

            //calculate sum
            int sum = a+b;

            //print sum
            System.out.println("the sum is "+sum);
        }
    }
    
}
