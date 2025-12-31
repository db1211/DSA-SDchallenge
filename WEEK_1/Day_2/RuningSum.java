import java.util.Arrays;

public class RuningSum {
    

    // Given an array nums, return a running sum array.

    // runningSum[i] = nums[0] + nums[1] + ... + nums[i]

    // Example:
    // Input:  [1, 2, 3, 4]
    // Output: [1, 3, 6, 10]

    // Explanation:
    // - Index 0: 1
    // - Index 1: 1 + 2 = 3
    // - Index 2: 1 + 2 + 3 = 6
    // - Index 3: 1 + 2 + 3 + 4 = 10

    public static int[] runningSum(int[] arr){

        int sum = arr[0];

        for(int i =1;i<arr.length ;i++){
            sum  = sum + arr[i];
            arr[i] = sum;

        }

        return arr;

    }

    public static void main (String args[]){

        int[] result = runningSum(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(result));
    }

}
