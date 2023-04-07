
interface  A{
    int a=100;
    void display();
}

public class Interface implements A{

   public void display(){
        System.out.println(a);
    }
    public static void main(String[] args){
       Interface i = new Interface();
       i.display();

    }
}
