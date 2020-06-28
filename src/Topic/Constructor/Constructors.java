package Topic.Constructor;

public class Constructors {
    Constructors(){
        System.out.println("Default Constructor");
    }
    Constructors(String name,int sal){
        System.out.println("Parameterized Constructor : 1");
        System.out.println("Name : "+name);
        System.out.println("Salary : "+sal);
    }
    Constructors(String name,int sal,int ph) {
        System.out.println("Parameterized Constructor : 2");
        System.out.println("Name : " + name);
        System.out.println("Salary : " + sal);
        System.out.println("Phone : " + ph);
    }
    public static void main(String[] args){
        Constructors a = new Constructors();
        Constructors b = new Constructors("Ashu",200000);
        Constructors c = new Constructors("Seetu",25000,123454321);
    }
}
