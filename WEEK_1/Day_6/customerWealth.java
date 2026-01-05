
public class customerWealth {

    public static int richestCustomerInBank(int[][] accounts){
        int richest = 0 ;
        int sum =0;
        for(int i = 0 ;i< accounts.length ;i++){
            sum= 0;

            for(int j = 0 ;j < accounts[i].length ;j++){
                // System.out.println("i : "+ i  + " j :" + j +" ele:" + accounts[i][j] );
                sum = sum +accounts[i][j];
                // System.out.println("sum: "+ sum );

            }
            if (sum > richest){
                // System.out.println("richest : "+ sum + " " + richest );
                richest = sum;
            }
        }
        return richest;
    }

    public static void main(String[] args) {
        System.out.println("richest customer in bank");
        int[][] acc = {
            {1, 5},
            {7, 3},
            {3, 5}
        };
        int result = richestCustomerInBank(acc);
        System.out.println("result : " +result);

    }
}
