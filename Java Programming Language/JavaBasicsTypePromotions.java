public class JavaBasicsTypePromotions {
    public static void main(String args[]){
        // char a = 'a';
        // char b = 'b';
        // System.out.println("b =  "+(int)(b));
        // System.out.println("a =  "+(int)a);
        // System.out.println(a); //no type promotions
        // System.out.println(b-a); //type promotion happens for operators

        // int a = 10;
        // float b = 20.25f;
        // long c = 25;
        // double d = 30;
        // double ans = a + b + c + d;
        // System.out.println(ans);

        byte b = 5;
        // b = b * 2; //this cannot be used an an operation '*' gives resultant as integer which cannot be stored in variable which is a byte
        byte a = (byte) (b*2); //typecasting done as an operation '*' is performed making the result an integer 
        System.out.println(a);
    }
}
