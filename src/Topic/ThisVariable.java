package Topic;

public class ThisVariable {
    int roll;
    String name;
    public void display(int n,String s){
        this.roll = n;
        this.name = s;
        System.out.println("Name : "+name);
        System.out.println("Roll : "+roll);
    }
    public static void main(String[] args){
        ThisVariable s1=new ThisVariable();
        ThisVariable s2=new ThisVariable();
        s1.display(111,"ankit");
        s2.display(112,"sumit");
    }
}
