import java.util.Scanner;

public class ComplexJavaCodeExample {

   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Enter the number of rows and columns of the matrix: ");
      
      int numRows = scanner.nextInt();
      int numColumns = scanner.nextInt();
      
      int[][] matrix = new int[numRows][numColumns];
      
      System.out.println("Enter the elements of the matrix: ");
      
      for (int i = 0; i < numRows; i++) {
         for (int j = 0; j < numColumns; j++) {
            matrix[i][j] = scanner.nextInt();
         }
      }
      
      int[] columnSums = new int[numColumns];
      
      for (int i = 0; i < numColumns; i++) {
         int sum = 0;
         for (int j = 0; j < numRows; j++) {
            sum += matrix[j][i];
         }
         columnSums[i] = sum;
      }
      
      System.out.println("The column sums are: ");
      for (int i = 0; i < numColumns; i++) {
         System.out.print(columnSums[i] + " ");
      }
   }
}
