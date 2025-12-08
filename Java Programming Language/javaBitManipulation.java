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

    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit == 0) {
        //     return clearIthBit(n, i);
        // } else {
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int BitMask = newBit<<i;
        return n | BitMask;
    }

    public static int clearIBits(int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static int clearRangeIBits(int n, int i, int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n) {
        return (n&(n-1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) != 0) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;
        while(n > 0) {
            if((n & 1) != 0) { //check LSB
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
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

        //update ith bit
        System.out.println(updateIthBit(10, 2, 1));

        //clear last i bits
        System.out.println(clearIBits(15, 2));

        //clear range of bits
        System.out.println(clearRangeIBits(10, 2, 4));

        //check if a number is a power of 2
        System.out.println(isPowerOfTwo(32));

        //count set bits in a number
        System.out.println(countSetBits(15));

        //fast exponentiation 
        System.out.println(fastExpo(3, 5));
    }
}
