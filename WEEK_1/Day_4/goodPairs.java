public class goodPairs {
    
    //using while
    public static int gpairs(int[] arr){

        int count = 0;
        int i = 0;
        int j = 1;
        
        while(i < arr.length -1){
            // System.out.println("start i :" + i +" , j: "+j +" , count :"+ count);

            if(j == arr.length -1){
                if(arr[i] == arr[j] ){
                count++;
                }
                i++;
                j= i+1;
                // System.out.println("j out of bound i :" + i +" , j: "+j +" , count :"+ count);
                continue;
            }

            if(arr[i] == arr[j] ){
                count++;
                j++;
                // System.out.println("matches i :" + i +" , j: "+j +" , count :"+ count);

                continue;
            }
            j++;
            // System.out.println("iteration closing i :" + i +" , j: "+j +" , count :"+ count);
        }

        return  count;

    }

    public static int gpair2(int[] arr){

        int count = 0;

        for(int i = 0 ;i < arr.length ;i++){
            System.out.println("i :" + i + "count :" + count );
            for(int j = i+1 ; j < arr.length ; j++){
                if (arr[i] == arr[j]){
                    count ++;
                }
                System.out.println("i :" + i + " , count :" + count + ", j :" + j );

            }
        }
        return count;

    }

    public static void main (String args[]){

        int result = gpairs(new int[]{1, 1, 1, 1});
        System.out.println("result :"+result);
        int result2 = gpair2(new int[]{1, 2, 3});
        System.out.println("result2 :"+result2);

    }
}
