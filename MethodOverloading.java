public class MethodOverloading {

    void method(){
        System.out.println("method without parameter");
    }
    void method(String a,String b){
        System.out.println("method with parameter "+a+" "+b);
    }
    void method(char a,char b){
        System.out.println("method with same parameter but diff data type "+a+" "+b);
    }
    public static void main(String[] args){
        MethodOverloading a = new MethodOverloading();

        a.method();
        a.method('a','b');
        a.method("method","overloading");

    }


}
