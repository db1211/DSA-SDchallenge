
import java.util.Arrays;

public class arraysPrac{


    public static void main(String[] args){


        int[] arrNums = {5,6,7,8,9,10,1,2,3,4,5};
        Arrays.sort(arrNums);
        System.out.println(Arrays.toString(arrNums));

        int[] clone = arrNums.clone();

        clone[0] = 55;
        int[] clone2 = Arrays.copyOf(arrNums, arrNums.length);
        clone2[0] = 56;


        System.out.println("og : " + Arrays.toString(arrNums));
        System.out.println("clone : " + Arrays.toString(clone));
        System.out.println("clone2 : " + Arrays.toString(clone2));
        //so clone are not deep copy


        //sort 
        int[] x = {5,4,3,2,1};
        Arrays.sort(x , 0 , 3);
        System.out.println("partial sorted X array : "+ Arrays.toString(x));



        //fill 
        int[] nums = new int[5];  // if no length provided it will be just empty 
        Arrays.fill(nums ,7);
        System.out.println("fill : " +  Arrays.toString(nums));


        //array compare 

        int[] a = {1,2,3,4};
        int[] b = {1,2,3,4};
        System.out.println("comapare : " + a.equals(b));
        System.out.println("comapare with Arrays.equals: " + Arrays.equals(a, b));
        
        int[] sortedNums = {1,2,3,4,5};
        int index =  Arrays.binarySearch(sortedNums, 5);
        int index2 =  Arrays.binarySearch(sortedNums, 0);
        System.out.println("index : " + index);
        System.out.println("index2 : " + index2);



    }

}