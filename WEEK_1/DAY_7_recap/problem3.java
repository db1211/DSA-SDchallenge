
public class problem3 {
    
    public static int maxSum(int[][] matrix){

        int max = Integer.MIN_VALUE;
        int row = 0;

        for(int i = 0; i< matrix.length;i++){
            int currSum = 0;
            for(int j = 0; j< matrix[i].length;j++){

                currSum += matrix[i][j];
            }
            if(currSum > max){
                max = currSum;
                row = i;
            }

        }

        return row;
    }

    public static void main(String[] args) {
        System.out.println("max sum");
        int[][] matrix = {{1, 2, 3},{4, 0, 0},{1, 1, 1}};
        int result = maxSum(matrix);
        System.out.println("result : "+ result);

    }
}
