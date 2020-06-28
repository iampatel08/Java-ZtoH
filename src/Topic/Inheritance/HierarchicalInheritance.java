package Topic.Inheritance;
class A1{
    void printA(){
        System.out.println("Class A1");
    }
}
class B1 extends A1{
    void printB(){
        System.out.println("Class B1");
    }
}
class C1 extends A1{
    void printC(){
        System.out.println("Class C1");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        B1 obj1 = new B1();
        C1 obj2 = new C1();

        obj1.printA();
        obj1.printB();
        obj2.printA();
        obj2.printC();

    }
}
