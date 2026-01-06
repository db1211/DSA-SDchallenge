public class problem1 {
    


    public static int targetvalur(int[] nums , int target){

        for(int i = 0; i< nums.length ; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        
        System.err.println("target");
        int result = targetvalur(new int[]{4,2,7,2,1},11);
        System.out.println("result : "+ result);
    }


}
