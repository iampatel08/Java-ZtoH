package Topic;
class Show{
    void single(){
        System.out.println("1 : Single Inheritance");
    }
    void multiple(){
        System.out.println("2 : Multiple Inheritance");
    }
    void multilevel(){
        System.out.println("3 : multilevel Inheritance");
    }
    void hierarchical(){
        System.out.println("4 : hierarchical Inheritance");
    }
    void hybrid(){
        System.out.println("5 : hybrid Inheritance");
    }
}
public class Inheritance extends Show{
    public static void main(String[] args){
        Inheritance obj = new Inheritance();
        obj.single();
        obj.multiple();
        obj.multilevel();
        obj.hybrid();
        obj.hierarchical();
    }
}
