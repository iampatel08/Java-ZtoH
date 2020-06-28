package Topic.Polymorphism;

//BY CHANGING RETURN TYPE OF METHODS
public class MethodOverloading3 {
    static int sum(int a,int b){
        System.out.println("Sum of 2 Integer is : "+(a+b));
       return a+b;
    }
    static double sum(int a,float b){
        System.out.println("Sum of 1 Integer & 1 Float is : "+(a+b));
        return a+b;
    }

    public static void main(String[] args) {
        MethodOverloading3 obj = new MethodOverloading3();
        int sum = obj.sum(6,8);
        double add = obj.sum(9, (float) 6.7);
    }
}
