import java.util.*;
public class JavaBasicsConditionalStatements {
    public static void main(String[] args) {
        // int age = 16;
        // if(age >= 18){
        //     System.out.println("adult : drive, vote");
        // }

        // if (age > 13 && age < 18){
        //     System.out.println("teenager");
        // }
        // else{
        //     System.out.println("not adult");
        // }

        //print the largest of 2 numbers
        // int a = 1;
        // int b = 5;

        // if(a>=b){
        //     System.out.println("a is larger");
        // }
        // else{
        //     System.out.println("b is larger");
        // }

        //print if a number is odd or even
        // int x = 5;
        // if(x%2==0){
        //     System.out.println("even");
        // }
        // else{
        //     System.out.println("odd");
        // }

        //else if
        // int age = 13;
        // if(age >= 18){
        //     System.out.println("adult");
        // }
        // else if(age >=13 && age <18){
        //     System.out.println("teenager");
        // }
        // else {
        //     System.out.println("child");
        // }

        //income tax calculator
        System.out.println("enter your salary");
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

        if(income <500000){
            tax = 0;
        }
        else if(income >=500000 && income < 1000000){
            tax = (int) (income * 0.2);
        }
        else {
            tax = (int) (income * 0.3);
        }
        System.out.println("your tax is : "+tax);
    }
}
