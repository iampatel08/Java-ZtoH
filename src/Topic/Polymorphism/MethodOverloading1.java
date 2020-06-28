package Topic.Polymorphism;


//BY CHANGING NUMBER OF PARAMETERS


public class MethodOverloading1{
    void sum(int a,int b){
        System.out.println("Sum of 2 integer is : "+(a+b));
    }
    void sum(int a,int b,int c){
        System.out.println("Sum of 3 integer is : "+(a+b+c));
    }
    public static void main(String[] args) {
        MethodOverloading1 obj = new MethodOverloading1();
        obj.sum(5,8);
        obj.sum(5,8,6);
    }
}
