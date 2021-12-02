import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExperationQ1 {
    public static void main(String[] args) {
        Pattern P=Pattern.compile("[b]+");
        Matcher M=P.matcher("acdhbbdjfhhbbkhbb");
        int co=0;
        while (M.find()){
            co++;
            System.out.println(M.group()+" here the strat the index "+M.start()+"-"+M.end());
        }
        System.out.println("count the number of the present in the given string="+co);
    }
}
