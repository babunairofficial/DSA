package practiceSolutions;

public class PracticeQuestion2 {
    public static void main(String[] args){
        //question 1
        // int x=2,y=5;

        // int exp1 = (x*y/x);
        // int exp2 = (x*(x/y));

        // System.out.print(exp1 + " , ");
        // System.out.print(exp2);   
        
        //question 2
        // int x = 200, y = 50, z = 100;
        // if(x > y && y > z){
        //     System.out.println("hello");
        // }
        // if(z > y && z < x){
        //     System.out.println("java");
        // }
        // if((y+200) < x && (y+150) < z){
        //     System.out.println("Hello Java");
        // }

        //question 3
        int x, y, z;
        x = y = z = 2;
        x +=y;
        y -=z;
        z /=(x+y);
        System.out.println(x + " " + y + " " + z);
    }    
}
