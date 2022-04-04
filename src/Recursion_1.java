public class Recursion_1 {
    public static int res(int[] arr, int Search_value){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==Search_value){
                return arr[i];
            }
        }
        return res(arr,Search_value);
    }

    public static void main(String[] args) {
        int arr[]={9,8,6};
        int Res=7;
        System.out.println( res(arr,Res));
    }
}
