/*

8. Matrix Rotation by 90 Degrees: 
Rotate a 2D matrix by 90 degrees clockwise. 
Input: Matrix: [[1, 2, 3], [4, 5, 6], [7, 8, 9]] 
Array-Based 
Output:Matrix:[[7, 4, 1], [8, 5, 2], [9, 6, 3]] 
Explanation: The matrix is rotated 90 degrees clockwise.*/

public class Q8 {
    public static void rotate(int[][] matrix){
        int rows = matrix.length;
        int col = matrix[0].length;
        int st =0;
        int end = rows;
        while(st<end){
            for(int i = 0; i<col; i++){
                int temp = matrix[st][i];
                matrix[st][i] = matrix[end-1][i];
                matrix[end-1][i] = temp;
            }
            st++;
            end--;
        }
        for(int i = 0; i<rows; i++){
            for(int j = i; j<col; j++){
                if(i != j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<col; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }
}
