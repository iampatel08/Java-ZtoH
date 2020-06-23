package BasicPrograms;
import java.util.Scanner;
public class Factorial {
    static int factorial(int n)
    {
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int i,fact=1;
        System.out.println("Enter Number to get Factorial");
        int number = s.nextInt();
        fact = factorial(number);
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
