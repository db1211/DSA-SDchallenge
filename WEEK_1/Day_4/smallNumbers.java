import java.util.Arrays;

public class smallNumbers {
    
    public static int[] smallNum(int[] arr){
        // int count = 0;
        int[] result = new int[arr.length];

        for(int i = 0 ;i < arr.length ;i++){
            // System.out.println("i :" + i + "count :" + count );
            int count = 0;
            for(int j = 0 ; j < arr.length ; j++){
                if (arr[i] > arr[j]){
                    count ++;
                }
                result[i] = count;
                // if(j == arr.length -1){
                //     // arr[i] = count;
                //     result[i] = count;
                //     count = 0;
                // }
                System.out.println("i :" + i + " , count :" + count + ", j :" + j  + " ele : "+ arr[i] + " compared : " + arr[j] + " result : "+ Arrays.toString(result));

            }
        }
        return result;
    }


    public static void main(String args[]){

        int[] result = smallNum(new int[]{8, 1, 2, 2, 3});
        System.out.println("result : "+ Arrays.toString(result));
    }


}
