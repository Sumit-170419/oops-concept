public class ThisKeyword {
     int a,b; //global variable/instance variable/class variable

     ThisKeyword(int a,int b) //method variable/local variable
     {
         this.a=a;   // differentiating same name variable by using this keyword
          this.b=b;  // this keyword represent the class variable
     }

     void number(int a,int b){
         this.a=a;
         this.b=b;
     }
     void sum(){
         System.out.println("sum of a & b = "+(a+b));
     }
     void mul(){
         System.out.println("multiplication of a & b = "+(a*b));

     }

     public static void main(String[] args){

         ThisKeyword t = new ThisKeyword(15,25);
         t.sum();
         t.number(3,6);
         t.mul();
     }
}
