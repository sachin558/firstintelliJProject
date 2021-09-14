public class box {
    int hight;
    float width;
    int depth;
    double vol;
}
 class boxdemo{
    public static void main(String[]args){
       box boxdemo=new box();
       box boxdemo1=new box();
       boxdemo.hight=560;
       boxdemo.width=596;
       boxdemo.depth=596;
       // assign the value of different box
        boxdemo1.hight=400;
        boxdemo1.width=500;
        boxdemo1.depth=600;
        boxdemo1.vol=boxdemo1.hight*boxdemo1.width*boxdemo1.depth;
       boxdemo.vol=boxdemo.hight*boxdemo.width*boxdemo.depth;
        System.out.print("this is the volum of the "+boxdemo.vol+"\n");
        System.out.println("this is the second value "+boxdemo1.vol);
    }

}
