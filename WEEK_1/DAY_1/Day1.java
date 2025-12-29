import java.util.Arrays;

public class Day1{


    public static int getNum(){
        System.out.println(2);
        return 2;
    }
    public static void main(String[] args){
        System.out.println("hello");
        getNum();

        int age = 25;
        long bigNumber = 10000000000000L;
        double price = 100.234;

        boolean Ready = true;
        char Grade = 'A';

        String name = "daniel";

        System.out.println(age);
        System.out.println(bigNumber);
        System.out.println(price);
        System.out.println(Ready);
        System.out.println(name);
        arrays();
    }


    public static void arrays(){
        int[] nums = {10,20,30,40};
        int[] scores =new int[5];
        scores[1] = 10;
        scores[2] =20;
        System.out.println("_________________________arrays_________________");
        System.out.println(scores[1]);
        System.out.println(Arrays.toString(scores));

        System.out.println(scores.length);

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        for(int num : nums){
            System.out.println(num);
        }

        Object[] someArr = {"A" ,1, "B" ,4 ,"asdsa"} ;
        System.out.println(Arrays.toString(someArr));
        System.out.println(someArr[2].getClass().getName());



    }
}