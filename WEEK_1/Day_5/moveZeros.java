import java.util.Arrays;

public class moveZeros {
    

    public static  int[] movezeros(int[] nums){
        int index =0; 
        for(int i =0; i< nums.length ;i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index ++;
            }

        }
        while(index < nums.length){
            nums[index] =0 ;
            index ++;
        }
        return nums;
        // return new int[]{};
    }

    public static  int[] movezeros1(int[] nums){
        int i =0;
        int j = 1;
        while (j < nums.length && i < nums.length){
            if (nums[i] == 0 && nums[j] != 0 ){
                // int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
                j++;
            }else if(nums[i] != 0  && nums[j] ==0){
                i++;
                j++;
            }else if(nums[i] == 0 && nums[j] == 0){
                j++;
            }else if(nums[i] != 0 && nums[j] != 0){
                i++;
                j++;
            }

            // System.out.println("rsult as of num : " + Arrays.toString(nums) + " "+ i + " " + j);


        }
        return nums;
    }


    public static void main (String[] args){

        System.out.println("Move zeros");
        int[]result = movezeros(new int[]{45192,0,-659,-52359,-99225,-75991,0,-15155,27382,59818,0,-30645,-17025,81209,887,64648});
        System.out.println("result : "+ Arrays.toString(result));
        int[]result2 = movezeros1(new int[]{45192,0,-659,-52359,-99225,-75991,0,-15155,27382,59818,0,-30645,-17025,81209,887,64648});
        System.out.println("result2 : "+ Arrays.toString(result2));
    }



}
