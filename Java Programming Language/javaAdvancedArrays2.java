public class javaAdvancedArrays2 {
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
    
}
