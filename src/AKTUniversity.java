public class AKTUniversity {
    void btech()
    {
        System.out.println("btech by AKTU");
    }
}
class college extends AKTUniversity
{
    void diploma()
    {
        System.out.println("Self course");
    }

    public static void main(String[] args) {
        college obj=new college();
        AKTUniversity com =new AKTUniversity();
        obj.btech();
    }
}