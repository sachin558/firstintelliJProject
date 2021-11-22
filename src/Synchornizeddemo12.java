class Account1 {
    int balanceamount;
    Account1(){
        balanceamount=10000;
    }
    public synchronized void withdraw(int ammount){
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        balanceamount=balanceamount-ammount;
        System.out.println(balanceamount);
    }
}
class Mythead extends Thread{
    Account1 obj=null;
    public Mythead(Account1 t1 ){
        obj=t1;
    }

    @Override
    public void run() {
        super.run();
        obj.withdraw(500);
    }
}
public class Synchornizeddemo12 {
    public static void main(String[] args) {
        Account1 a1=new Account1();
        Mythead obj=new Mythead(a1);
        Mythead obj2=new Mythead(a1);
        Mythead obj3=new Mythead(a1);
        obj2.start();
        obj3.start();

    }
}
