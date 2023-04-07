
interface Pehla{
    int s = 12;
    int a = 23;
    void add();
}
interface Dusra{
    int g = 8;
    int f  = 4;
    void mul();
}
public class MultipleInterface implements Pehla,Dusra {
    public void add(){
        System.out.println(s+a);
    }
    public void mul(){
        System.out.println(g*f);
    }
    public static void main(String[] args){
        MultipleInterface n = new MultipleInterface();
        n.add();
        n.mul();
    }
}
