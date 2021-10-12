/*
Write a class called Saxophone which implements Playable interface
. Let this class be placed in a package music.wind
 */
package music.wind;

import music.Playboy;

public class Saxophone  implements Playboy {
    @Override
    public void play() {
        System.out.println("Sexophone ");
    }
}
