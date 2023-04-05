//using different type of method
public class Methods {
    int x;
    int y;

    //case1 : no parameter , no return value
    void sum1(){
        System.out.println(x+y);
    }
    //case2 : no parameter , return value
    int sum2(){
        return x+y;
    }
    //case3 : take parameter , no return value
    void sum3(int a,int b){
        x=a;
        y=b;
        System.out.println(x+y);
    }
    //case4 : take parameter , return value
    int sum4(int a,int b){
        x=a;
        y=b;
        return x+y;
    }
}
