public class Static {
        static int x;
        int y;

        static void display(){
            System.out.println("this is a static method");
        }
        void display1(){
            System.out.println("non static method");
        }
        void nonStatic(){       //nonstatic method can call static and nonstatic var. and method
            x = 12;
            y = 17;
            display1();
            display();
        }
            public static void main(String[] args){
            x = 10;                 //static variable and static method can be called directly
            display();
                System.out.println(x);

            Static s = new Static();
            s.display1();
            s.y = 20;
                System.out.println(s.y);
            }
}



