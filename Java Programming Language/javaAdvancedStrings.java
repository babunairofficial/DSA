import java.util.*;
public class javaAdvancedStrings {
    public static void printLetters(String str) {
        for(int i=0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        char arr[] ={'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

        //Strings are IMMUTABLE

        //input/output
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        //string length
        System.out.println(name.length());
        
        //string concatenate
        String firstName = "Bruce";
        String lastName = "Wayne";
        String fullName = firstName + " " + lastName;
        System.out.println("This is " + fullName);

        //charAt
        System.out.println(fullName.charAt(1));

        printLetters(fullName);
    }    
}
