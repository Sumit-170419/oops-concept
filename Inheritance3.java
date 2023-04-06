// hierarchical inheritance

class P1{
     int a;
     void display(){
         System.out.println(a);
     }
}

class B1 extends P1{
    int b;
    void show(){
        System.out.println(b);
    }
}
class C1 extends P1{
    int c;
    void print(){
        System.out.println(c);
    }
}
public class Inheritance3 {
    public static void main(String[] args){
        B1 d = new B1();
        C1 e = new C1();

        d.a = 5;
        d.b = 3;
        d.show();
        d.display();

        e.a = 2;
        e.c = 4;
        e.display();
        e.print();


    }
}
