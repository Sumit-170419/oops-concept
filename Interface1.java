// multiple interface
interface J{
    int a=10;
    void display();
}
interface D{
    int b =20;
    void show();
}
public class Interface1 implements J,D {
    public void display(){
        System.out.println(a);
    }
    public void show(){
        System.out.println(b);
    }
    public static void main(String[] args){
        Interface1 i = new Interface1();
        i.display();
        i.show();


    }
}
