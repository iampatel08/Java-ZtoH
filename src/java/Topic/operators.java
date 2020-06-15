package java.Topic;//  Types of Operators in JAVA
import java.util.Scanner;   // Class for Scanner
public class operators {



    //Arithmetic Operators
    public void arithmeticOperators(){
        System.out.println();System.out.println();
        System.out.println("Arithmetic Operators");
        System.out.println();
        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;
        String x = "Thank", y = "You";
        // + and - operator
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        // + operator if used with strings
        // concatenates the given strings.
        System.out.println("x + y = " + x + y);
        // * and / operator
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        // modulo operator gives remainder
        // on dividing first operand with second
        System.out.println("a % b = " + (a % b));
    }



    //Unary Operators
    public void unaryOperators() {
        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;
        boolean condition = true;
        System.out.println();System.out.println();
        System.out.println("Unary Operators");
        System.out.println();
        // pre-increment operator
        // a = a+1 and then c = a;
        c = ++a;
        System.out.println("Value of c (++a) = " + c);
        // post increment operator
        // c=b then b=b+1
        c = b++;
        System.out.println("Value of c (b++) = " + c);
        // pre-decrement operator
        // d=d-1 then c=d
        c = --d;
        System.out.println("Value of c (--d) = " + c);
        // post-decrement operator
        // c=e then e=e-1
        c = e--;
        System.out.println("Value of c (e--) = " + c);
        // Logical not operator
        System.out.println("Value of !condition =" + !condition);
    }



    //Assignment Operators
    public void assignmentOperators(){
        System.out.println();System.out.println();
        System.out.println("Assignment Operators");
        System.out.println();
        int a = 20, b = 10, c, d, e = 10, f = 4, g = 9;
        // simple assignment operator
        c = b;
        System.out.println("Value of c = " + c);
        // This following statement would throw an exception
        // as value of right operand must be initialised
        // before assignment, and the program would not
        // compile.
        // c = d;

        // instead of below statements, shorthand
        // assignment java.Topic.operators can be used to
        // provide same functionality.
        a = a + 1;
        b = b - 1;
        e = e * 2;
        f = f / 2;
        System.out.println("a, b, e, f = " + a + ", " + b + ", " + e + ", " + f);
        a = a - 1;
        b = b + 1;
        e = e / 2;
        f = f * 2;

        // shorthand assignment operator
        a += 1;
        b -= 1;
        e *= 2;
        f /= 2;
        System.out.println("a, b, e, f (" + "using shorthand java.Topic.operators)= " + a + ", " + b + ", " + e + ", " + f);
    }



    //Relational Operators
    public void relationalOperators(){
        System.out.println();System.out.println();
        System.out.println("Relational Operators");
        System.out.println();
        int a = 20, b = 10;
        String x = "Thank", y = "Thank";
        int ar[] = { 1, 2, 3 };
        int br[] = { 1, 2, 3 };
        boolean condition = true;

        // various conditional java.Topic.operators
        System.out.println("a == b :" + (a == b));
        System.out.println("a < b :" + (a < b));
        System.out.println("a <= b :" + (a <= b));
        System.out.println("a > b :" + (a > b));
        System.out.println("a >= b :" + (a >= b));
        System.out.println("a != b :" + (a != b));

        // Arrays cannot be compared with
        // relational java.Topic.operators because objects
        // store references not the value
        System.out.println("x == y : " + (ar == br));

        System.out.println("condition==true :" + (condition == true));
    }




    //Logical Operators
    public void logicalOperators(){
        System.out.println();System.out.println();
        System.out.println("Logical Operators");
        System.out.println();
        String x = "Sher";
        String y = "Locked";

        Scanner s = new Scanner(System.in);
        System.out.print("Enter username:");
        String uuid = s.next();
        System.out.print("Enter password:");
        String upwd = s.next();

        // Check if user-name and password match or not.
        if ((uuid.equals(x) && upwd.equals(y)) || (uuid.equals(y) && upwd.equals(x))) {
            System.out.println("Welcome user.");
        }
        else {
            System.out.println("Wrong uid or password");
        }
    }




    //Ternary Operator
    public void ternaryOperator(){
        System.out.println();System.out.println();
        System.out.println("Ternary Operators");
        System.out.println();
        int a = 20, b = 10, c = 30, result;

        // result holds max of three
        // numbers
        result = ((a > b)
                ? (a > c)
                ? a
                : c
                : (b > c)
                ? b
                : c);
        System.out.println("Max of three numbers = "
                + result);
    }





    //Bitwise Operators
    public void  bitwiseOperators(){
        System.out.println();System.out.println();
        System.out.println("Bitwise Operators");
        System.out.println();
        // if int a = 010
        // Java considers it as octal value
        // of 8 as number starts with 0.
        int a = 0x0005;
        int b = 0x0007;

        // bitwise and
        // 0101 & 0111=0101
        System.out.println("a&b = " + (a & b));

        // bitwise and
        // 0101 | 0111=0111
        System.out.println("a|b = " + (a | b));

        // bitwise xor
        // 0101 ^ 0111=0010
        System.out.println("a^b = " + (a ^ b));

        // bitwise and
        // ~0101=1010
        System.out.println("~a = " + ~a);

        // can also be combined with
        // assignment operator to provide shorthand
        // assignment
        // a=a&b
        a &= b;
        System.out.println("a= " + a);
    }




    //Shift Operators
    public void ShiftOperators(){
        System.out.println();System.out.println();
        System.out.println("Shift Operators");
        System.out.println();
        int a = 0x0005;
        int b = -10;

        // left shift operator
        // 0000 0101<<2 =0001 0100(20)
        // similar to 5*(2^2)
        System.out.println("a<<2 = " + (a << 2));

        // right shift operator
        // 0000 0101 >> 2 =0000 0001(1)
        // similar to 5/(2^2)
        System.out.println("a>>2 = " + (a >> 2));

        // unsigned right shift operator
        System.out.println("b>>>2 = " + (b >>> 2));
    }

    public static void main(String[] args)
    {
        operators obj = new operators();
        obj.arithmeticOperators();
        obj.assignmentOperators();
        obj.bitwiseOperators();
        obj.ShiftOperators();
        obj.ternaryOperator();
        obj.unaryOperators();
        obj.relationalOperators();
        obj.logicalOperators();
    }
}
