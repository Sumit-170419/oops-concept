// single level inheritance
class Parent{
    int a;
    void display(){
        System.out.println(a);
    }

}
class Child extends Parent{
    int b;
    void show(){
        System.out.println(b);
    }
}
public class Inheritance1 {
    public static void main(String[] args) {
        Parent p = new Parent();
       /* p.a = 20;
        p.display(); */

        Child c = new Child();
        c.b = 15;
        c.show();
        c.a = 20;
        c.display();    // from child class object we are accessing variables and methods of parent class


    }

}
