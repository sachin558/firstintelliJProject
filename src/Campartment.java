/*
public abstract String notice();
Derive FirstClass, Ladies, General, Luggage classes from the compartment class.
Override the notice function in each of them to print
 notice message that is suitable to the specific type of  compartment.
 */
public abstract class Campartment {
    abstract void notic();
}
 class Fristclass  extends Campartment{
    @Override
    void notic() {
        System.out.println("THis is the first class ");
    }
}
class ladies extends Campartment{
    @Override
    void notic() {
        System.out.println("This is the ladies claas of the campartment");
    }
}
class Gerenal extends Campartment{
    @Override
    void notic() {
        System.out.println("this the gerenal class ");
    }
}
class Language extends Campartment {
    @Override
    void notic() {
        System.out.println("This is the language class");
    }

    public static void main(String[] args) {
        Fristclass obj=new Fristclass();
        obj.notic();
        ladies obj1=new ladies();
        obj1.notic();
        Gerenal obj2=new Gerenal();
        obj2.notic();
    }
}
