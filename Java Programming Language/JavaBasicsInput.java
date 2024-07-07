import java.util.*;

public class JavaBasicsInput {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            System.out.println((name));

            int number = sc.nextInt();
            System.out.println(number);
        }

        //nextByte
        //nextFloat
        //nextDouble
        //nextBoolean
        //nextShort
        //nextLong
        

    }
}
