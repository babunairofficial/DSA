package recursion;

public class RecursionBasics {
    public static void printDec(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if(n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {
        if(n == 0) {
            return 1;
        }
        
        int fn = n * fact(n-1);
        return fn;
    }

    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }
        int s = n + sum(n-1);
        return s;
    }

    public static int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }

        int fib1 = fib(n-1);
        int fib2 = fib(n-2);
        int fn = fib1 + fib2;
        return fn;
    }

    //checks if an array is sorted or not
    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length-1) {
            return true;
        }

        if(arr[i] > arr[i+1]) {
            return false;
        }

        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        // int n = 25;
        int arr[] = {5, 6, 9};
        // printDec(n);
        // printInc(n);
        // System.out.println(fact(n));
        // System.out.println(sum(n));
        // System.out.println(fib(n));
        System.out.println(isSorted(arr, 0));
    }
}
