package Topic.Inheritance;

import java.util.Scanner;

class Base{
    void printSquare(int n){
        System.out.println("Square of number "+n+" is : "+(n*n));
    }
    void printCube(int n){
        System.out.println("Cube of number "+n+" is : "+(n*n*n));
    }
    void printTable(int n){
        System.out.println("Table of number "+n+" is :");
        for (int i =1;i<=10;i++){
            System.out.println(i*n);
        }
    }
}
class Derived extends Base{
    void checkEvenOdd(int n){
        if(n%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    void checkPrime(int n){
        int flag =0;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                flag = 1;
            }
        }
        if(flag==0){
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is not Prime");
        }
    }
    void checkArmstrong(int n){
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
public class SingleInheritance{
    public static void main(String[] args){
        Derived obj = new Derived();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number to operate : ");
        int num = s.nextInt();
        System.out.println();
        System.out.println("What you want to do, Please select from following list");
        System.out.println("Press 1 to get Square of the Number");
        System.out.println("Press 2 to get Cube of the Number");
        System.out.println("Press 3 to get Table of the Number");
        System.out.println("Press 4 to check Number is Even or Odd");
        System.out.println("Press 5 to check Number is Prime or not");
        System.out.println("Press 6 to check Number is Armstrong or not");
        int ch = s.nextInt();
        switch (ch){
            case 1: obj.printSquare(num);
            break;
            case 2: obj.printCube(num);
            break;
            case 3: obj.printTable(num);
            break;
            case 4: obj.checkEvenOdd(num);
            break;
            case 5: obj.checkPrime(num);
            break;
            case 6: obj.checkArmstrong(num);
            break;
            default: System.out.println("Wrong Choice !!!!!!!!1 Have a nice day");
                System.exit(0);
        };
    }
}
