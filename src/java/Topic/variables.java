package java.Topic;

//  Types of VARIABLES in JAVA
public class variables {
    int a = 100;    // Instance Variable
    static int b = 90; //Static variable or Class variable
    public void printnumber()
    {
        int c = 20; // Local Variable
        System.out.println("Local Variable is "+c);
        System.out.println("Instance Variable is "+a);
    }
    public static void main(String[] args){
        variables obj = new variables();
        System.out.println("Static Variable is "+b);
        obj.printnumber();
    }
}
