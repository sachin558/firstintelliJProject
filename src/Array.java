class emp
{
    int eid ;
    String name;
}
public class Array {
    public static void main(String[] args) {
        emp arr[]=new emp[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new emp();
        }
        System.out.println(arr);
    }
}
