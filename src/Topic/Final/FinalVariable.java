package Topic.Final;

//If you make any variable as final, you cannot change the value of final variable(It will be constant).


class FinalVariable {
    final int speedlimit=90;//final variable
    void run(){
        //speedlimit=400;                     //Compile Time Error. No value can be assigned to Final Variable
    }
    public static void main(String args[]){
        FinalVariable obj=new FinalVariable();
        obj.run();
    }
}