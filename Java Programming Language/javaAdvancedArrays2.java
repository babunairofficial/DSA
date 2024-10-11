public class javaAdvancedArrays2 {
    /* 
    //Maximum Subarray Sum -1 
    public static void subArraysSum(int numbers[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            int start = i;
            for(int j = i; j < numbers.length; j++ ){
                int end = j;
                currentSum = 0;
                for(int k = start; k <= end; k++){
                    currentSum += numbers[k];
                }
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }                                
            }            
        }
        System.out.println(maxSum);        
    }
    public static void main(String[] args) {
        int numbers[] = {0, -2, 4, -1, 8, 10};
        subArraysSum(numbers);
    }
    */
    
    /* 
    //Maximum Subarray Sum (Prefix sum approach)
    public static void subArraysSum(int numbers[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int [numbers.length]; 

        prefix[0] = numbers[0];
        //calculate prefix array
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for(int i = 0; i < numbers.length; i++){
            int start = i;
            for(int j = i; j < numbers.length; j++ ){
                int end = j;
                currentSum = start == 0? prefix[end] : prefix[end] - prefix[start - 1]; //ternary operator incase start = 0
                
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }                                
            }            
        }
        System.out.println(maxSum);        
    }
    public static void main(String[] args) {
        int numbers[] = {0, -2, 4, -1, 8, 10};
        subArraysSum(numbers);
    }
    */

    //Maximum Subarray Sum (kadane's algorithm)
    public static void kadanes(int numbers[]){
            int currentSum = 0;
            int maxSum = Integer.MIN_VALUE;
            for(int i = 0; i < numbers.length; i++){
                currentSum += numbers[i];
                if(currentSum < 0){
                    currentSum = 0;
                }
                maxSum = Math.max(currentSum, maxSum);
            }
            System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {-1,-4,2,5,-6,7,4,-2};
        kadanes(numbers);
    }
}
