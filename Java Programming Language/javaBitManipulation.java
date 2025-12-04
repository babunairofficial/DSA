public class javaBitManipulation {

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            //even
            System.out.println("even number");
        } else {
            //odd
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {

        //Binary Left Shift
        System.out.println((5<<2));

        //Binary Right Shift
        System.out.println((6>>1));

        //check odd or even
        oddOrEven(5);
        oddOrEven(17);
        oddOrEven(24);
    }
}
