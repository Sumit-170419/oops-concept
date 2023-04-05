public class AssignmentStudent{

    int sId,sub1,sub2,sub3;
    String sName;

    void getStuData(int id,String n){
        sId = id;
        sName = n;
    }
    void getStuMarks(int s1,int s2,int s3){
        sub1 =  s1;
        sub2 = s2;
        sub3 = s3;
    }
    void totalMarks(){
        int tm = sub1+sub2+sub3;
        System.out.println("student id =  "+sId);
        System.out.println("student name = "+sName);
        System.out.println("total marks = "+tm);
    }
    public static void main(String[] args){
        AssignmentStudent a = new AssignmentStudent();
        a.getStuData(1, "Sumit");
        a.getStuMarks(75,82,79);
        a.totalMarks();

    }
}
