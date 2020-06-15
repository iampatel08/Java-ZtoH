package java.Topic;//  FOR LOOP in JAVA
import java.util.Scanner;
public class forLoop {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Table for desired Input");
        int num = s.nextInt();
        for (int i = 2;i<=10;i++){
            System.out.println(i*num);
        }
    }
}
