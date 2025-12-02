import java.util.*;
public class javaAdvancedStrings {
    public static void printLetters(String str) {
        for(int i=0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static String subString(String strng, int si, int ei) {
        String substr = "";
        for(int i = si; i < ei; i++) {
            substr += strng.charAt(i);
        }
        return substr;
    }
    public static String toUpperCase(String str) {
            StringBuilder sb = new StringBuilder("");

            char ch = Character.toUpperCase(str.charAt(0));
            sb.append(ch);

            for(int i = 1; i < str.length(); i++) {
                if(str.charAt(i) == ' ' && i < str.length()-1) {
                    sb.append(str.charAt(i));
                    i++;
                    sb.append(Character.toUpperCase(str.charAt(i)));
                } else {
                    sb.append(str.charAt(i));
                }
            }
            return sb.toString();
        }

    public static String compress(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            int count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
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


        //compare strings
        
        String s1 = "rahul";
        String s2 = "rahul";
        String s3 = new String("rahul");

        // if(s1 == s2) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        // if(s1 == s3) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        if(s1.equals(s3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        } /* == compares references
        .equals() compares contents
        */


        //substring
        String strng = "HelloWorld";
        System.out.println(subString(strng, 0, 5));

        //shortcut method for substring
        System.out.println(strng.substring(0, 5));


        //string builder
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
            System.out.println(sb);
        }

        System.out.println(sb.length());


        //Word to uppercase
        
        String lowerstr = "hi, i am ramesh";
        System.out.println(toUpperCase(lowerstr));


        //String Compression

        String compressStr = "aaabbccccd";
        System.out.println(compress(compressStr));
    }
}
