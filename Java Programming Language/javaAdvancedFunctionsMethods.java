import java.util.Scanner;

public class javaAdvancedFunctionsMethods {
    /* 
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
    */
    //functions - find binomial coefficient
    /*
    //find factorial
    public static int factorial(int a){
        int fact = 1;
        for(int i=1; i<=a;i++){
            fact *= i;
        }
        return fact;
    }
    //find bincoeff
    public static int bincoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int bincoeff = fact_n/(fact_r*fact_nmr);
        return bincoeff;
    }
    //arguments in main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        System.out.println("enter the value of r ");
        int r = sc.nextInt();
        System.out.println("The binomial coefficient is "+bincoeff(n, r));
        sc.close();
    }
     */

    //function overloading 
    /* 
    //function to calculate sum of 2 nums 
    public static int sum(int a, int b){
        return a+b;
    }
    //function to calculate sum of 3 nums
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    //function to calculate sum of 2 float values
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,4));
        System.out.println(sum(1,2,3));
        System.out.println(sum(6.4f, 8.1f));
    }
    */

    //Print all Primes in a Range
    /* 
    public static void primeCheck(int i){
        int ctr = 0;
        for(int j = 1; j<=i; j++){
            if(i % j == 0){
                ctr++;
            }
        }
        if(ctr<=2){
            System.out.println(i);
        }
    }
    public static void primesInRange(int a, int b){
        for(int i = a; i<b; i++){
            primeCheck(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number in the range");
        int a = sc.nextInt();
        System.out.println("enter the last number in the range");
        int b = sc.nextInt();
        primesInRange(a,b);

        sc.close();
    }
    */

    //Binary to Decimal
    /* 
    public static void binToDec(int bin){
        int binNum = bin;
        int power = 0;
        int decimal = 0;

        while(bin >0){
            int lastDigit = bin % 10;
            decimal = decimal + (lastDigit * (int)Math.pow(2, power));
            power++;
            bin /=10;

        }
        System.out.println("decimal of "+binNum+ " is "+decimal);

    }
    public static void main(String[] args) {
        binToDec(101);
    }
    */

    //Decimal to Binary

    public static void decToBin(int dec){
        int decNum = dec;
        int power = 0;
        int bin = 0;

        while(dec > 0){
            int rem = dec % 2;
            bin = bin + (rem * (int)Math.pow(10, power));
            power++;
            dec /=2;

        }
        System.out.println("decimal of "+decNum+ " is "+bin);
    }
    public static void main(String[] args) {
        decToBin(15);
    }
}
