public class PracticeQuestion8 {
    public static void main(String[] args) {

        /* 
        // Question 1
        int[][] array = { {4, 7, 8}, {8, 8, 7} };

        int countOf7 = 0;
        for(int i=0; i<array.length; i++) {
            for(int j=0; j < array[0].length; j++) {
                if(array[i][j] == 7) {
                    countOf7++;
                }
            }
        }
        System.out.println( "count of 7 is : " + countOf7);
        */

        // Question 2
        int[][] nums = { {1,4,9}, {11,4,3}, {2,2,3} };
        int sum = 0;

        // sum of 2nd row elements
        for(int j = 0; j < nums[0].length; j++) {
            sum += nums[1][j];
        }

        System.out.println("sum is : " + sum);
    }    
}
