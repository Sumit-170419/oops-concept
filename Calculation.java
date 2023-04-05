// assignment 2
public class Calculation {
    int a,b,c;

    Calculation(int x,int y,int z){
        a = x;
        b = y;
        c = z;
    }

    void sum(){
        System.out.println("sum of numbers is = "+(a+b+c));
    }
    public static void main(String[] args){
        Calculation c = new Calculation(23,34,22);
        c.sum();

    }
}
