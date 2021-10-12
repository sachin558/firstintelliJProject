package i1;

 interface Playbo{
     void M2();
}
class veena implements Playboy{
    @Override
    public void play() {
        System.out.println("This is thew placed in packege musci.string");
    }

    public static void main(String[] args) {
        veena obj=new veena();
        obj.play();
    }
}
