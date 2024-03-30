package Programs;

import UDClasses.Pair;

public class usePair {
    
    public static void main(String args[]){
        Pair<Integer, Integer> p = new Pair<>(1, 2);
        p.setFirst(5);
        System.out.println(p.getFirst() + " " + p.getSecond());
    }
}
