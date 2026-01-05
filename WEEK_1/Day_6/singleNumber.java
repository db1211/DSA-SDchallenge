public class singleNumber {
    

    public static int singlNumber(int[] nums){
        int count = 0;
        int result =0;
        for(int i =0 ;i < nums.length ; i++){
            count = 0;
            for(int j = 0; j < nums.length ; j++ ){
                if(nums [i] ==  nums[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("result bf : "+ nums[i]);
                result = nums[i];
                return result;
                // return nums[i];
            }
        }
        return  result;
    }


    public static void main(String[] args) {
        System.err.println("single number");
        int[] nums = {2, 2, 1};
        int res = singlNumber(nums);
        System.out.println("result  :" + res);
    }
}
