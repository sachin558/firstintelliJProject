public class Shape {
    void draw(){
        System.out.println("Drawing shape");
    }
    void erase(){
        System.out.println("Erasing shape ");
    }

    public static void main(String[] args) {
        Shape obj=new Shape();
        obj.draw();
        obj.erase();
    }
}
