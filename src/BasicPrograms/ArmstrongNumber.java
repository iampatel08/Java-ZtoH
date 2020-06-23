package BasicPrograms;

import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to check Armstrong");
        int n = s.nextInt();
        int m, r, sum = 0;
        m = n;
        while (n != 0) {
            r = n % 10;
            sum = sum + r*r*r;
            n = n / 10;
        }
        if (m == sum)
            System.out.println("Number is Armstrong");
        else
            System.out.println("Number is not Armstrong");
    }
}
