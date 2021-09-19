// This is the execution  formate of static block  and instanceblock or constructor and main method

public class StaticInstanceConstruter {
    // Instance block
    // After exdecution of the main method then this block will be execute
    {
        System.out.println("This the instance block ");
    }
    // Static block
    // first this block will be execute ,
    static {
        System.out.println("This the static block");
    }
    //  Non parameterize constructor
    // After excution of the instance block then constructor will be execute
    StaticInstanceConstruter(){
        System.out.println("This the constructor ");
    }
    // Main Method
    // After execution of the static block then main method will be execute
    public static void main(String[] args) {
        System.out.println("This the main method ");
        StaticInstanceConstruter obj=new StaticInstanceConstruter();
    }
}
