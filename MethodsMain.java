//calling different types of method
public class MethodsMain {
    public static void main(String[] args){
        Methods m = new Methods();

        m.x = 10;
        m.y = 20;

        m.sum1();

        int r=m.sum2();
        System.out.println(r);

        m.sum3(11,12);

        int s=m.sum4(5,2);
        System.out.println(s);
    }
}
