//Hybrid interface

class One{
    void display(){
        System.out.println("class method");
    }
}
interface Two{
    void show();
}
interface Three{
    void print();
}
public class Interface3 extends One implements Two,Three {
     public void show(){
         System.out.println("first interface");
    }
    public void print(){
        System.out.println("second interface");
    }
    public static void main(String[] args){
        Interface3 i = new Interface3();
        i.display();
        i.print();i.show();
    }
}
