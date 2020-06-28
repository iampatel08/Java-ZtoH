package Topic.Polymorphism;

//Method Overloading with Type Promotion if matching found
public class MethodOverloading4 {
    void sum(int a,int b){System.out.println("int arg method invoked");}
    void sum(long a,long b){System.out.println("long arg method invoked");}

    public static void main(String args[]){
        MethodOverloading4 obj=new MethodOverloading4();
        obj.sum(20,20);//now int arg sum() method gets invoked
    }
}
