package Topic;//  Do - While LOOP in JAVA
import java.util.Scanner;
public class doWhileLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Table for desired Input");
        int num = s.nextInt();
        int i = 1;
        System.out.println("Table for "+num+" is");
        do {
            System.out.println(i*num);
            i++;
        }while (i<11);
    }
}
