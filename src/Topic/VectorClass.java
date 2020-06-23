package Topic;

import java.util.Vector;

public class VectorClass {
    public static void main(String[] args){
        java.util.Vector<String> vec = new java.util.Vector<String>();
        //Adding elements using add() method of List
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");
        //Adding elements using addElement() method of Vector
        vec.addElement("Rat");
        vec.addElement("Cat");
        vec.addElement("Deer");

        System.out.println("Elements are: "+vec);
    }
}

