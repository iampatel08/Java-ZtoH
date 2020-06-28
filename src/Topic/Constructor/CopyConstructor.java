package Topic.Constructor;

public class CopyConstructor {
    int id;
    String name;
    //constructor to initialize integer and string
    CopyConstructor(int i, String n){
        id = i;
        name = n;
    }
    //constructor to initialize another object
    CopyConstructor(CopyConstructor s){
        id = s.id;
        name =s.name;
    }
    CopyConstructor(){}             //Copying w/o Constructor
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        CopyConstructor s1 = new CopyConstructor(111,"Karan");
        CopyConstructor s2 = new CopyConstructor(s1);
        CopyConstructor s3 = new CopyConstructor();
        s3.id=s1.id;
        s3.name=s1.name;
        s1.display();
        s2.display();
        s3.display();
    }
}