
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ## Day 1, Session 2: Your First 3 Problems

// Now let's solve problems. I want you to **try each one yourself first**, then I'll review.

// ---

// ### Problem 1: Print Array Elements
// ```
// Given an integer array, print each element on a new line.

// Input: [5, 10, 15, 20]
// Output:
// 5
// 10
// 15
// 20
// ```

// **Your task:** Write a method `printArray(int[] arr)`

// ---

// ### Problem 2: Find Maximum Element
// ```
// Given an integer array, return the maximum element.

// Input: [3, 7, 2, 9, 1]
// Output: 9

// Input: [-5, -2, -10]
// Output: -2
// ```

// **Your task:** Write a method `findMax(int[] arr)` that returns an `int`

// ---

// ### Problem 3: Reverse Array (In-Place)
// ```
// Given an integer array, reverse it in-place (don't create a new array).

// Input: [1, 2, 3, 4, 5]
// Output: [5, 4, 3, 2, 1]
// Y

public class day1_prac{


    public static void printArray(){

        List<Integer> list =  new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        System.out.println("printarr");
        System.out.println(list.get(1));
        
    }

    public static int findMaxElement(List<Integer> list){
        // int min = list.indexOf(0) ;
        int max = list.get(0);
        for(int num : list){
            if(num < max ){
                max = num;
            }
        }
        System.out.println("result from findMax");
        return max;

    }

    public static List<Integer> reverseArray(List<Integer> list){
        List<Integer> list2  = new ArrayList<>();
        for(int i=list.size() -1; i>= 0 ;i-- ){
            System.out.println(i);
            list2.add(list.get(i));
        }
        System.out.println("result from reverseArray");
        return list2;
    }

    public static void reverseArrayInPlace(int[] arr){
        int left =0 ;
        int right = arr.length -1;

        while(left < right ){
            System.out.println("in loop");
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right --;
        }
        System.out.println("result from reverseArrayinplace");


    }

    public static void main ( String[] args){
        System.out.println("Day1 prac>>>");
        printArray();
        
        System.out.println(findMaxElement(List.of(3, 7, 2, 9, 1 ,0 ,-100)));
        System.out.println(reverseArray(List.of(3, 7, 2, 9, 1 ,0 ,-100)));
        int[] listvar = {3, 7, 2, 9, 1 ,0 ,-100};
        reverseArrayInPlace(listvar);
        System.out.println(Arrays.toString(listvar));
    }

}

