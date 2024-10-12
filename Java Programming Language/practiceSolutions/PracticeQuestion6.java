package practiceSolutions;
public class PracticeQuestion6 {
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
}
