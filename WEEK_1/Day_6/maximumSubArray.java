public class maximumSubArray {
    
    public static int  maximumSubArraypblm (int[] nums){
    if(nums.length == 1){
                return nums[0];
            }
            
            int max = Integer.MIN_VALUE; 
            
            for(int i =0 ;i < nums.length ;i++){
                int currSum =0 ;
                for(int j =i ;j < nums.length ;j++){
                    currSum += nums[j];
                    if(currSum >  max){
                        max = currSum;
                    }

                }
            }

            return max;
        } 

    public static void main(String[] args) {
        System.err.println("maximum subarray");
        int[] nums = {5, 4, -1, 7, 8};
        int result = maximumSubArraypblm((nums));
        System.out.println("res : "+ result );
    }
}
