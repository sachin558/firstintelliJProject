package i1;

 interface Playboy {
     void play();
}
class a1 implements Playboy{
    @Override
    public void play() {
        System.out.println("intereface placed in the packege music");
    }

    public static void main(String[] args) {
        a1 obj=new a1();
        obj.play();
    }
}
