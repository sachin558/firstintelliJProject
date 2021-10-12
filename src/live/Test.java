package live;

import music.Playboy;
import music.string.Veena;
import music.wind.Saxophone;

abstract class Test {
    public static void main(String[] args) {
        Veena v=new Veena();
        v.play();
        Playboy pc=new Veena();
        pc.play();
        Saxophone s=new Saxophone();
        s.play();
    }
}
