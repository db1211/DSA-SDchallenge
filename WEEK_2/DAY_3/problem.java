import java.util.ArrayList;
import java.util.Arrays;


public class problem {
    

    public static  ArrayList<Integer> removeDuplicates(ArrayList<Integer>nums ){
        
        ArrayList<Integer> result = new ArrayList<>();

        for(int i =0 ;i < nums.size() ; i++){
            if(!result.contains(nums.get(i))){
                result.add(nums.get(i));
            }
        }
        return  result;
    }

    public static ArrayList<Integer> reverseInPlace(ArrayList<Integer> nums){

        int i =0;
        int j =nums.size() -1;
        while(j > 0 ){
            System.out.println("i : "+ i + "j : "+j) ;
            int temp = nums.get(i);
            nums.set(i , nums.get(j));
            nums.set(j , temp);
            i++;
            j--;
        }

        return nums;
    }

    public static int secondLargest(ArrayList<Integer> nums){
        int fL = Integer.MIN_VALUE;
        int sL=Integer.MIN_VALUE;

        for(int i = 0 ;i< nums.size() ; i++){
            if(nums.get(i) > fL){
                sL = fL;
                fL = nums.get(i);
            }else if(nums.get(i) > sL){
                sL = nums.get(i);
            }
        }

        if(sL !=  fL){
            return sL;

        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println("problem");
        // ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Jane"));
        // ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 1,3));
        // ArrayList<Integer> result = removeDuplicates(nums);
        // System.err.println("result : " + result);


        // ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        // ArrayList<Integer> result = reverseInPlace(nums);
        // System.err.println("result : " + result);

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5,5,5,5,5));
        int result = secondLargest(nums);
        System.err.println("result : " + result);
    }
}
