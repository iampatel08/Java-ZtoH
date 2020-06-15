package java.Topic;//  If - ELSE in JAVA
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First NUMBER");
        int a = s.nextInt();
        System.out.println("Enter Second NUMBER");
        int b = s.nextInt();
        System.out.println("Enter Third NUMBER");
        int c = s.nextInt();
        if ((a>b)&&(a>c))
        {
            System.out.println(a+" is Largest NUMBER");
        }
        else if(b>c){
            System.out.println(b+" is Largest NUMBER");
        }
        else {
            System.out.println(c+" is Largest NUMBER");
        }
    }
}
