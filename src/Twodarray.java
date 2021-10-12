public class Twodarray {
         int [][]arr1={{1,2,4}
                 ,{2,3,4}};
         int [][]arr2={{6,7,8}
                 ,{8,9,7}};
         int [][]arr3={{0,0,0}
                 ,{0,0,0}};

    public void display(){
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr3[i][j]+" ");
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Twodarray obj=new Twodarray();
        obj.display();
    }
}
