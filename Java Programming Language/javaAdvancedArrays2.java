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

    /* 
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
    */

    /* 
    //Trapping Rainwater - Space time complexity O(n)
    public static int trappingRainwater(int height[]){
        int n = height.length;

        int left_max[] = new int [n];
        left_max[0] = height[0];
        for(int i = 1; i < n; i++){
            left_max[i] = Math.max(height[i], left_max[i-1]);
        }
        
        int right_max[] = new int [n];
        right_max[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            right_max[i] = Math.max(height[i], right_max[i+1]);
        }

        int trappedWater = 0;
        for(int i = 0; i < n; i++){
            int waterLevel = Math.min(left_max[i], right_max[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappingRainwater(height));
    }
    */

    //Trapping water - second method (without creating new arrays) Space Time complexity O(1)    
    public static int trappingRainwater(int height[]) {
        int n = height.length;
        int left_max = 0;
        int right_max = 0;
        int left = 0;
        int right = n - 1;
        int trappedWater = 0;
    
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= left_max) {
                    left_max = height[left];
                } else {
                    trappedWater += left_max - height[left];
                }
                left++;
            } else {
                if (height[right] >= right_max) {
                    right_max = height[right];
                } else {
                    trappedWater += right_max - height[right];
                }
                right--;
            }
        }
    
        return trappedWater;
    }
    
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappingRainwater(height));
    }
}
