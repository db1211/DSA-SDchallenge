import java.util.Arrays;

public class candies {
    

    public boolean [] candies (int[] arr , int extra){

        int greatest = Arrays.stream(arr).max().getAsInt();
        boolean[] result = new boolean [arr.length];
        for(int i = 0;i < arr.length ; i++){
            if(arr[i] + extra >= greatest){
                result[i] = true;
            }else{
                result[i] = false;
            }
            
        }
        return  result;
    }

    public void main(String[] args){
        System.out.println("candies");
        boolean[]result = candies(new int[]{2, 3, 5, 1, 3},3);
        System.out.println(Arrays.toString(result));
    }


}
