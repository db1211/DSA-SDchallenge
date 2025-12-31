import java.util.Arrays;

public class TwoSum {
    
    // Problem 1: Two Sum (Brute Force)
    // Example 1:
    // Input: nums = [2, 7, 11, 15], target = 9
    // Output: [0, 1]
    // Explanation: nums[0] + nums[1] = 2 + 7 = 9

    // Example 2:
    // Input: nums = [3, 2, 4], target = 6
    // Output: [1, 2]
    // Explanation: nums[1] + nums[2] = 2 + 4 = 6

    public int[] TwoSum(int[] arr , int target){

        for(int i =0 ;i < arr.length ;i++){
            int balance = target - arr[i];
            
            for(int j = i+1; j<arr.length ;j++){
                if(balance == arr[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }


    public  void main (){

        int[] arr ={2,5,5,11};
        int target = 10;
        int[] result = TwoSum(arr , target);
        System.out.println(Arrays.toString(result));

    }


}
