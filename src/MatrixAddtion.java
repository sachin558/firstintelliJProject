import java.util.Scanner;

public class MatrixAddtion {
   int arr1[][],arr2[][],arr3[][];int row,column;
    Scanner sc=new Scanner(System.in);
   MatrixAddtion(){
       System.out.println("enter the  of the first matrix row  ");
        row=sc.nextInt();
       System.out.println("enter the column of the matrix ");
       column=sc.nextInt();
       arr1=new int[row][column];
       System.out.println("entre the of the second matrix row and column ");
       arr2=new int[row][column];
       arr3=new int[row][column];
   }
   public void display(){
       System.out.println("enter the first matrix element ");
       for (int i = 0; i <row ; i++) {
           for (int j = 0; j <column; j++) {
               arr1[i][j]=sc.nextInt();
           }
       }
       System.out.println("enter  the second matrix element ");
       for (int i = 0; i < row; i++) {
           for (int j = 0; j < column; j++) {
               arr2[i][j]=sc.nextInt();
           }
       }
       for (int i = 0; i <row; i++) {
           for (int j = 0; j <column; j++) {
               arr3[i][j]=arr3[i][j]+arr1[i][j]*arr2[i][j];
           }
       }
       for (int i = 0; i < column; i++) {
           for (int j = 0; j < row; j++) {
               System.out.print(arr3[i][j]+" \t");
           }
           System.out.print("\n");
       }
   }

    public static void main(String[] args) {
        MatrixAddtion obj=new MatrixAddtion();
        obj.display();
    }
}
