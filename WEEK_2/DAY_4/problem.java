
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class problem {
    

    public static HashMap<Integer , Integer> frequencyCount(ArrayList<Integer> nums){

        System.out.println("some out");

        HashMap<Integer , Integer> map = new HashMap<>();
        for( int num : nums){
            if(map.containsKey(num)){
                map.put(num , map.get(num) + 1);
            }else{
                map.put(num , 1);
            }
        }
        return map;

    }


    public static char nonRepeatingCharacter(String s){

        Map<Character, Integer> freq = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq.get(c) == 1) {
                return c;
            }
        }
        return '_';
    }

    



    public static void main(String[] args) {
        HashMap<Integer, Integer> result = frequencyCount(new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3)));
        System.out.println("problem map : "+  result);
    }


}
