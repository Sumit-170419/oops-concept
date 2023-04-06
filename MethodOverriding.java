class First{
    void display(){
        System.out.println("in class first");
    }
}
class Second extends First{
    void display(){
        System.out.println("in class second");
    }
}

class Third extends First{
    void display(){
        System.out.println("in third class");
    }
}

class Fourth extends Second{
    void display(){
        System.out.println("in fourth class");
    }
}

public class MethodOverriding {
    public static void main(String[] args){
        Second s = new Second();
        s.display();

        Third t = new Third();
        Fourth f = new Fourth();

        t.display();
        f.display();
    }
}
