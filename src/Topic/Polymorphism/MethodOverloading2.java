package Topic.Polymorphism;

//BY CHANGING TYPE OF PARAMETERS
public class MethodOverloading2 {
    void sum(int a,int b){
        System.out.println("Sum of 2 integer is : "+(a+b));
    }
    void sum(int a,float b){
        System.out.println("Sum of 1 Integer & 1 Float is : "+(a+b));
    }

    public static void main(String[] args) {
        MethodOverloading2 obj = new MethodOverloading2();
        obj.sum(4,7);
        obj.sum(5,7);
    }
}
