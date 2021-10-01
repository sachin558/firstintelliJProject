 abstract class Thrid{
  abstract   public void methd();
}
/*class Fourth extends Thrid{
  public void methd(){
    System.out.println("welcome ");
  }
}
*/

public class UseOfabstractMe {
  public static void main(String[] args) {
    Thrid obj=new Thrid() {
      @Override
      public void methd() {
        System.out.println("enterthe ");

      }
    };
  }
}
