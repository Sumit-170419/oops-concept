public class CallByRefrence {
    int x,y;

    public void addition(CallByRefrence a) {
        x = a.x + 5;
        y = a.y + 5;
        System.out.println("value of x = " + x);
        System.out.println("value of y = " + y);
        System.out.println("sum is = " + (x + y));
    }
    public static void main(String[] args){
        CallByRefrence cr= new CallByRefrence();
         cr.x = 10;
         cr.y = 20;
         cr.addition(cr); // call by reference
    }
}
