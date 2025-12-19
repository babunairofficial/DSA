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
    public static void main(String[] args) {
        // System.out.println(tilingProblem(4));

        String str = "indianinstituteoftechnology";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
