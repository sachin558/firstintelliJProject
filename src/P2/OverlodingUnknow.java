package P2;

public class OverlodingUnknow {
    int rollno;
    String name;
    int  age;
    OverlodingUnknow(){
        rollno=0;
        name="unknow";
        age=0;
    }
    public void Setvalue(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    public void Setvalue(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    public void show(){
        System.out.println(rollno+ " "+name +" "+age);
    }
}
