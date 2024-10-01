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
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a last number");
        int lastNumber = sc.nextInt();
        int x = 1;
        while(x <= lastNumber){
            System.out.print(x + " ");
            x++;
        }
        sc.close();


    }
}
