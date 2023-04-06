public class CallByValue {
    int x,y;

    public void addition(int a,int b) {
        x = a + 5;
        y = b + 5;
        System.out.println("value of x = " + x);
        System.out.println("value of y = " + y);
        System.out.println("sum is = " + (x + y));
    }
    public static void main(String[] args){
        CallByValue cv = new CallByValue();
        cv.addition(12,15); //calling method by value
    }
}
