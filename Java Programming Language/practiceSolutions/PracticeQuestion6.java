package practiceSolutions;
public class PracticeQuestion6 {

    /* 
    //Question 1 - return true if an element is appearing atleast twice

    //Approach 1 - O(n^2)
    public static boolean repeatingNumbers(int nums[]){
        //iteration for elements in array
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //an integer array
        int nums[] = {1,3,2,4,2};
        //print the return value of the method called. 
        System.out.println(repeatingNumbers(nums));
    }
    */
    
    /* 
    //Question 2 - 
    
        public static int search(int[] nums, int target) {
            // Check for null or empty array
            if (nums == null || nums.length == 0) {
                return -1;
            }
            
            int left = 0;
            int right = nums.length - 1;
            
            while (left <= right) {
                // Calculate middle index
                int mid = left + (right - left) / 2;
                
                // If middle element is the target, return its index
                if (nums[mid] == target) {
                    return mid;
                }
                
                // Check if the left half is sorted
                if (nums[left] <= nums[mid]) {
                    // If target is in the left half
                    if (target >= nums[left] && target < nums[mid]) {
                        right = mid - 1; // Search left half
                    } else {
                        left = mid + 1; // Search right half
                    }
                } 
                // Right half is sorted
                else {
                    // If target is in the right half
                    if (target > nums[mid] && target <= nums[right]) {
                        left = mid + 1; // Search right half
                    } else {
                        right = mid - 1; // Search left half
                    }
                }
            }
            
            // Target not found
            return -1;
        }
    
        public static void main(String[] args) {            
            int[] nums = {4, 5, 6, 7, 0, 1, 2}; // Example rotated sorted array
            int target = 0; // Value to search for
            int result = search(nums, target);
            System.out.println("Index of " + target + ": " + result);
        }
        */

        //Question 3 - profit in stocks

        public static int maxProfit(int prices[]){
            int buy = prices[0];
            int profit = 0;
            for(int i = 1; i < prices.length; i++){
                if(buy < prices[i]){
                    profit = prices[i] - buy;
                }else{
                    buy = prices[i];
                }
            }
            return profit;
        }
        public static void main(String[] args) {
            int prices[] = {8,5,1,3,2,9,7,11};
            System.out.println("maximum profit = "+maxProfit(prices));
        }
    }

