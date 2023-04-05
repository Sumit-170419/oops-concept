public class Student {

    int sid;
    String sName;
    char grade ;

    void getValue(int id,String name,char g){
        sid=id;
        sName=name;
        grade=g;
    }
    void display(){

        System.out.println(sid);
        System.out.println(sName);
        System.out.println(grade);
    }
}
