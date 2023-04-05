// accessing variables and object of another class by creating object of that class.
// main() is in different class and variables,methods are in different class.
// assigning the value to variables
public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.empID = 14;
        e.empName = "akash";
        e.dept = 13;
        e.job = "sales";

        e.display();
    }

}
