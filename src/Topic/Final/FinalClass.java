package Topic.Final;


//If you make any class as final, you cannot extend it.

final class ABC{}

//class FinalClass extends ABC      // We cant extend
class FinalClass{
    void run(){System.out.println("running safely with 100kmph");}

    public static void main(String args[]){
        FinalClass honda= new FinalClass();
        honda.run();
    }
}
