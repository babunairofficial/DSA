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

    public static int getIthBit(int n, int i) {
        int bitMask = 1<<i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
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

        //get ith Bit
        System.out.println(getIthBit(10, 2));

        //set ith bit
        System.out.println(setIthBit(10, 2));

        //clear ith bit
        System.out.println(clearIthBit(10, 1));
    }
}
