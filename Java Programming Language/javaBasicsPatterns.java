import java.util.Scanner;

public class javaBasicsPatterns {
    public static void main(String[] args) {
        //Nested loop (Star pattern)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int star = sc.nextInt();
        for(int i = 1; i<=star; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
