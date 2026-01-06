import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class problem2 {
    
    public static int[] twosum(int[] nums , int target){
        
        for(int i = 0 ;i < nums.length;i++){
            int balance = target - nums[i] ;

            for(int j = i+1 ;j< nums.length ;j++){
                if(nums[j] == balance){
                    return new int[]{i , j};
                }
            }
            
        }

        return new int[]{};
    }


    public static int[] twosum2(int[] nums , int target) {

        Map<Integer, Integer> hm = new HashMap<>();
        // int balance =0
        for(int i = 0 ; i<nums.length ;i++){

            if(hm.containsKey(nums[i] )){
                return new int[]{i , hm.get(nums[i])};
            }
            int balance = target -nums[i];
            hm.put(balance ,i);
        }

        return new int[]{};

        
    }

    public static void main(String[] args) {
        System.out.println("twosum");
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int[] result = twosum(nums, target);
        System.out.println("result : "+Arrays.toString(result));
        int[] result2 = twosum2(nums, target);
        System.out.println("result2 : "+Arrays.toString(result));

    }
}
