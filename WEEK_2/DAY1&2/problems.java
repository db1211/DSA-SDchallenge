import java.util.ArrayList;

public class problems {

    public static  int maxDiff( int[] nums){

        int max_diff = Integer.MIN_VALUE;

        for(int i =0;i < nums.length ; i++){
            for(int j = i+1 ;j < nums.length ; j++){
                if(nums[i] < nums [j]  && nums[j] - nums[i] > max_diff){
                    max_diff = nums[j] - nums[i];
                }

            }
        }
        if(max_diff != Integer.MIN_VALUE){

            return max_diff;
        }
        return -1;
    }

    //time complexity
    // o(n2)
    //space complexity
    //o(1)
    public static  int adduptosum (int[] nums , int target) {


        int paircount = 0;
        for(int i = 0 ;i < nums.length ; i++){
            for(int j = i+1 ;j < nums.length ; j++){
                // System.out.println("elements : "+ nums[i] + " " + nums[j]);
                if(nums[i] + nums[j] == target){
                    // System.out.println("yes : "+ nums[i] + " " + nums[j]);
                    paircount += 1;
    
                }
            }
        }

        return paircount;
    }
    //time complexity :
    //o(n2)
    // space complexity :
    //o(1)

    public static ArrayList<Integer> IntersectionOfTwoArrays(int[] nums1 , int[] nums2){

        ArrayList<Integer> result = new ArrayList<>();
        for(int i =0 ;i< nums1.length ;i++){
            for(int j =0 ;j< nums2.length ; j++){
                if(nums1[i] == nums2[j] && !result.contains(nums1[i])){
                    result.add(nums1[i]);
                }
            }
        }

        return result;


    }

    //time complexity 
    // o(n*m) i think also the look up in the resukt array matters since its not done suing index 
    //space complexity 
    //O(min(n, m)) 



    public static void main(String[] args) {
        // System.out.println("maximum difference");
        // int result = maxDiff(new int[]{5, 4, 3, 2, 1});
        // System.err.println("result : " + result);
        // int result2 = adduptosum(new int[]{1, 2, 3, 4, 3} , 6);
        // System.err.println("result2 : " + result2);

        ArrayList<Integer> result3 = IntersectionOfTwoArrays(new int[]{1, 2, 2, 1} , new int[]{2, 2});
        System.err.println("result3 : " +result3);
    }
    
}
