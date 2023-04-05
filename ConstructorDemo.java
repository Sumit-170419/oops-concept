public class ConstructorDemo{
    int x,y,z;
    ConstructorDemo()    //default constructor
    {
        x = 10;
        y = 20;
        System.out.println(x+y);
    }

    ConstructorDemo(int a,int b){    //parameterized constructor
        x=a;
        y=b;
        System.out.println(x+y);
    }
    ConstructorDemo(int a,int b,int c){   //constructor overloading with diff. parameter
        x = a;
        y = b;
        z = c;
        System.out.println(x+y+z);
    }
    ConstructorDemo(String a,String b){ //constructor overloading with same parameter but diff. data type
        System.out.println(a+" "+b);
    }
    public static void main(String[] args){
    // ConstructorDemo c = new ConstructorDemo();
      //  ConstructorDemo c = new ConstructorDemo(2,4);
       // ConstructorDemo c = new ConstructorDemo(2,3,4);
        ConstructorDemo c = new ConstructorDemo("sumit","sharma");
    }
}
