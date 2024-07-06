import java.util.*;

public class JavaBasicsInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //variable name can be anything, here it is sc
        // String input = sc.next(); //for single word entry
        // System.out.println(input);

        String name = sc.nextLine();
        System.out.println((name));

        int number = sc.nextInt();
        System.out.println(number);

        //nextByte
        //nextFloat
        //nextDouble
        //nextBoolean
        //nextShort
        //nextLong
        

    }
}
