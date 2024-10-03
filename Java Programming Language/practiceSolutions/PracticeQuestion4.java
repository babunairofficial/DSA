package practiceSolutions;

import java.util.Scanner;

public class PracticeQuestion4 {
    public static void main(String[] args) {
        //Question 1
        /* 
        for(int i=0; i<5; i++){
            System.out.println("Hello"); // output - 2 times
            i+=2;
        }
        */

        //Question 2 - Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        /* 
        Scanner sc = new Scanner(System.in);
        
        int odd = 0;
        int even = 0;
        char str;

        do{
            System.out.println("Enter a number");
            int n = sc.nextInt();

            if(n%2 == 0){
                even += n;
            }
            else{
                odd += n;
            }
    
            System.out.println("Do you want to continue. If yes press 'y', else press 'n'");
            str = sc.next().charAt(0);

        }while(str != 'n');
        System.out.println("Sum of even numbers is "+even);
        System.out.println("Sum of odd numbers is "+odd);
        
        sc.close();
        */

        //question 3 - write a program to find the factorial of any number entered by the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int factorial=1;
        for(int i=1; i<=number; i++){
            factorial *= i;
        }
        System.out.println("Factorial of "+number+" is "+factorial);
        sc.close();
    }
}
