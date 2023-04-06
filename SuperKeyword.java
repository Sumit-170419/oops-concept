
class Animal{
    String color = "black";

    void eating(){
        System.out.println("eating....");
    }
}
class Dog extends  Animal{

    String color = "white";

    void eating(){
        System.out.println("eating bread");
        super.eating();
    }
    void display(){
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class SuperKeyword {
    public static void main(String[] args){
        Dog d=new Dog();
        System.out.println(d.color);
        d.eating();
        d.display();
    }
}
