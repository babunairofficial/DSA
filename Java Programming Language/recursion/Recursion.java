package recursion;
public class Recursion {

    //Tiling Problem
    public static int tilingProblem(int n) {
        //base case
        if(n == 0 || n == 1) {
            return 1;
        }

        //vertical choice
        int verticalTiles = tilingProblem(n-1);

        //horizontal choice
        int horizontalTiles = tilingProblem(n-2);

        int totalWays = verticalTiles + horizontalTiles;

        return totalWays;
    }

    public static void removeDuplicates(String str, int x, StringBuilder newStr, boolean map[]) {
        //base case
        if(x == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(x);
        if(map[currChar - 'a'] == true) {
            //duplicate
            removeDuplicates(str, x+1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, x+1, newStr.append(currChar), map);
        }

    }

    public static int friendsPairing(int n) {
        if(n == 1 || n ==2) {
            return n;
        }

        //single 
        int fnm1 = friendsPairing(n-1);

        //pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //total ways
        int totalWays = fnm1 + pairWays;
        return totalWays;

        // quicker way for friends pairing question
        // return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }

    public static void printBinstrings(int n, int lastPlace, String str) {
        if(n ==0) {
            System.out.println(str);
            return;
        }

        printBinstrings(n-1, 0, str+"0");
        if(lastPlace == 0) {
            printBinstrings(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        // System.out.println(tilingProblem(4));

        // String str = "indianinstituteoftechnology";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

        // System.out.println(friendsPairing(3));

        printBinstrings(3, 0, "");
    }
}
