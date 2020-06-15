package java.Topic;//  While LOOP in JAVA
import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to check Palindrome");
        int n = s.nextInt();
        int m, r, sum = 0;
        m = n;
        while (n != 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (m == sum)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not Palindrome");
    }
}
