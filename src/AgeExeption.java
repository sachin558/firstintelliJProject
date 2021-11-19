public class AgeExeption  extends  Exception {
    public AgeExeption(String s) {
        super(s);
    }
}
class Testere {
    static void display(int age) throws AgeExeption {
        if (age > 18) {
            throw new AgeExeption(" valid ");
        } else {
            System.out.println("not valid");
        }
    }

    public static void main(String[] args) {
        try {
            display(89);
        } catch (AgeExeption e) {
            System.out.println("Exeption is the accured" + e);
        }
        System.out.println("end of the code");
    }
}
