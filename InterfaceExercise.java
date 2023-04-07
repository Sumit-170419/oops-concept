
interface Face{
    int a = 25;
    int b = 35;
    void sum();
}
public class InterfaceExercise implements Face{
    public void sum(){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        InterfaceExercise h = new InterfaceExercise();
        h.sum();
    }
}
