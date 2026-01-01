
import java.util.Arrays;



public class suffleArrays {

    public int[] suffle (int[] arr , int n ){
        int[] result = new int[arr.length];
        int index =0;
        for(int i =0; i< n ;i ++){
            result[index] = arr[i];
            index++;
            result[index] = arr[i + n];
            index++;
        }

        return result;
    }

    public void main (String[] args){
        int[]result =suffle(new int[]{2, 5, 1, 3, 4, 7}, 3);
        System.out.println(Arrays.toString(result));
    }

}
