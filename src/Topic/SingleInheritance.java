package Topic;

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
public class SingleInheritance extends Base{
    public static void main(String[] args){
        SingleInheritance obj = new SingleInheritance();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number to operate : ");
        int num = s.nextInt();
        System.out.println();
        System.out.println("What you want to do, Please select from following list");
        System.out.println("Press 1 to get Square of the Number");
        System.out.println("Press 2 to get Cube of the Number");
        System.out.println("Press 3 to get Table of the Number");
        int ch = s.nextInt();
        switch (ch){
            case 1: obj.printSquare(num);
            break;
            case 2: obj.printCube(num);
            break;
            case 3: obj.printTable(num);
            break;
            default: System.out.println("Wrong Choice !!!!!!!!1 Have a nice day");
                System.exit(0);
        }
    }
}
