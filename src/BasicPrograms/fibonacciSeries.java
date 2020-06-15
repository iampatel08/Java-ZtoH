package BasicPrograms;

public class fibonacciSeries {
    public static void main(String[] args){
        int n0=0,n1=1,n;
        System.out.print(n0+",");
        System.out.print(n1+",");
        for (int i=1;i<=10;i++){
            n=n0+n1;
            n0=n1;
            n1=n;
            System.out.print(n+",");
        }
    }
}
