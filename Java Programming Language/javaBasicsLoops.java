import java.util.Scanner;

public class javaBasicsLoops {
    public static void main(String[] args) {
        //while loop
        /*
        int ctr = 0;
        while(ctr < 100){
            System.out.println("hello world using while loop");
            ctr++;
        }
        */

        //while loop - print numbers from 1 to 10
        /* 
        int n = 1;
        while(n<=10){
            System.out.print(n+" ");
            n++;
        }
        */

        //while loop - print numbers from 1 to n
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a last number");
        int lastNumber = sc.nextInt();
        int x = 1;
        while(x <= lastNumber){
            System.out.print(x + " ");
            x++;
        }
        */

        //while loop - sum of first N natural numbers
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of N");
        int N = sc.nextInt();
        int x = 1;
        int sum = 0;
        while(x <= N){
            sum += x;
            x++;
        }
        System.out.println("sum of "+N+" natural numbers is = "+sum);
        sc.close();
        */

        //for loop

        //for loop - print square pattern
        /* 
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=4; j++){
                System.out.print('*');
            }
            System.out.println();
            
        }
        */

        //for loop - print reverse of a number
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        int reverse = 0;
        for(int i=number;i>0;i=i/10){
            reverse = reverse*10 + i % 10;
        }
        System.out.println(reverse);
        sc.close();
        */

        //break statement
        //question - keep entering numbers till user enters a multiple of 10.
        /* 
        Scanner sc = new Scanner(System.in);
        do{
            
            System.out.println("enter a number");
            int num = sc.nextInt();
            if(num == 10){
                break;
            }
            
                
        }
        while(true);
        sc.close();
        */

        //check if a number is prime or not
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check for prime");
        int n = sc.nextInt();
        int ctr = 0;
        for(int i = 1; i<n/2;i++){
            if(n%i == 0){
                ctr++;
            }
        }
        if(ctr >1){
            System.out.println("Not a prime number");
        }
        else
        {
            System.out.println("Prime number");
        }
        sc.close();
    }
}
