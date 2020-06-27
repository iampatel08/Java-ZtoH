package Topic;
class A{
    void printA(){
        System.out.println("Class A");
    }
}
class B extends A{
    void printB(){
        System.out.println("Class B");
    }
}
class C extends B{
    void printC(){
        System.out.println("Class C");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.printA();
        obj.printB();
        obj.printC();
    }
}
