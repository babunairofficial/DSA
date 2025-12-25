//Recursion Basics
package practiceSolutions;

public class PracticeQuestion12 {
    //question 1
    public static void allOccurences(int arr[], int key, int i) {
        if(i == arr.length) {
            return;
        }
        if(arr[i] == key) {
            System.out.print(i+" ");
        }
        allOccurences(arr, key, i+1);
    }

    //question 2
    
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void printDigits(int number) {
        if(number == 0) {
            return;
        }

        int lastDigit = number%10;
        printDigits(number/10);
        System.out.print(digits[lastDigit] + " ");
    }
    
    //question 3
    public static int length(String str) {
        if(str.length() == 0) {
            return 0;
        }
        return length(str.substring(1)) + 1;
    }

    //question 4
    public static int countSubstrs(String str, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        int res = countSubstrs(str, i + 1, j, n - 1) +
        countSubstrs(str, i, j - 1, n - 1) - countSubstrs(str, i + 1, j - 1, n - 2);
        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }
        
    
    public static void main(String[] args) {
        // int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // int key = 2;
        // allOccurences(arr, key, 0);
        // System.out.println();
        // printDigits(1234);
        // System.out.println();

        // String str = "abcde";
        // System.out.println(length(str));

        String str = "abcab";
        int n = str.length();
        System.out.print(countSubstrs(str, 0, n-1, n));
    }
}
