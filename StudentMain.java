// assigning value to variables by using method
public class StudentMain {
    public static void main(String[] args){

        Student s1 = new Student();
        Student s2 = new Student();

        s1.getValue(3,"sorav",'a');
        s2.getValue(2,"sumit",'b');

        s1.display();
        s2.display();

    }
}
