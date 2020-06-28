package Topic.Static;

class Student{
    int rollno;
    String name;
    static String college = "ABC";
    static void change(){
        college = "DEF";
    }

    Student(int r, String n){
        rollno = r;
        name = n;
    }
    void display(){System.out.println(rollno+" "+name+" "+college);}
}
public class StaticMethod{
    public static void main(String[] args){


        Student s1 = new Student(001,"Alex");
        Student s2 = new Student(002,"Aurthur");
        Student s3 = new Student(003,"Anni");

        s1.display();
        s2.display();
        Student.change();//calling change method
        s3.display();
    }
}
