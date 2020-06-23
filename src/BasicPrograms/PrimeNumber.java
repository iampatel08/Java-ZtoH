package BasicPrograms;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number to check it is Prime or Not");
        int num = s.nextInt();
        int a = num/2;
        int count =0;
        for (int i=2;i<a;i++){
            if(num%i==0)
                count = 1;
        }
        if (count==0){
            System.out.println("It is Prime");
        }
        else{
            System.out.println("It is not Prime");
        }
    }
}
