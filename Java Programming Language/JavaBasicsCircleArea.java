import java.util.*;

public class JavaBasicsCircleArea {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            
            //input
            System.out.println("enter the radius");
            float radius = sc.nextFloat();

            //area
            float area = 3.14f * radius * radius;

            //print
            System.out.println(area);
        }


    }
    
}
