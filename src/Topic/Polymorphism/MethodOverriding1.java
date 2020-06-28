package Topic.Polymorphism;

class Vehicle{
    //defining a method
    void run(){System.out.println("Vehicle is running");}
}
public class MethodOverriding1 extends Vehicle{
        //defining the same method as in the parent class
        void run(){System.out.println("Bike is running safely");}

        public static void main(String args[]){
            MethodOverriding1 obj = new MethodOverriding1();//creating object
            //Vehicle v = new Vehicle();
            obj.run();//calling method
            //v.run();
        }
}
