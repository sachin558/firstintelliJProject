public class saletionshortinthejava {
    int  arr[]={10,20,303,44,55};
    saletionshortinthejava(){
    }
    void display(){
        for (int i = 0; i < arr.length; i++) {
            int min=i;
            for (int j=i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    min=j;
                }
                
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        saletionshortinthejava obj=new saletionshortinthejava();
        obj.display();
    }
}
