import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;

public class CreatNegativearray{
    static void display(int a[]){
        int to=0;
        for (var i:a){
            to+=i;
        }
        System.out.println(to);
    }

    public static void main(String[] args) {
        CreatNegativearray.display(new int[]{10,203,30294});

    }
}