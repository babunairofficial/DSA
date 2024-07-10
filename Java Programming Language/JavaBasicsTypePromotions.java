public class JavaBasicsTypePromotions {
    public static void main(String args[]){
        // char a = 'a';
        // char b = 'b';
        // System.out.println("b =  "+(int)(b));
        // System.out.println("a =  "+(int)a);
        // System.out.println(a); //no type promotions
        // System.out.println(b-a); //type promotion happens for operators

        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double ans = a + b + c + d;
        System.out.println(ans);
    }
}
