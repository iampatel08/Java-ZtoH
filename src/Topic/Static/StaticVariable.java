package Topic.Static;
public class StaticVariable {
    int rollno;//instance variable
    String name;
    static String college ="ITS";//static variable
    //constructor
    StaticVariable(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display the values
    void display (){System.out.println(rollno+" "+name+" "+college);}
    public static void main(String[] args){
        Student s1 = new Student(001,"Alex");
        Student s2 = new Student(002,"Anni");
        //we can change the college of all objects by the single line of code
        //Student.college="BBDIT";
        s1.display();
        s2.display();
    }
}

