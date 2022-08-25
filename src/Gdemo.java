import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Gdemo {
    Map<Integer, LinkedList> obj;
    Gdemo(){
        obj=new HashMap<>();
    }
    public  void addKey(int v1,int v2,boolean isbidirection){
        LinkedList<Integer> v1ne=obj.getOrDefault(v1,new LinkedList());
        v1ne.add(v2);
        obj.put(v1,v1ne);
        if (isbidirection==true){
            LinkedList<Integer> v2neb=obj.getOrDefault(v2,new LinkedList());
            v2neb.add(v1);
            obj.put(v2,v2neb);
        }
    }
    public  void display(){

    }
}
