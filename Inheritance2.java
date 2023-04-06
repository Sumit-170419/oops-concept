// multi level inheritance
class P{
    int a;
    void display(){
        System.out.println(a);
    }

}
class B extends P{
    int b;
    void show(){
        System.out.println(b);
    }
}
class C extends B{
    int c;
    void print(){
        System.out.println(c);
    }
}
public class Inheritance2 {
    public static void main(String[] args){
        C s = new C();
        s.a = 10;
        s.b = 20;
        s.c = 30;
        s.display();
        s.show();
        s.print();
    }
}
