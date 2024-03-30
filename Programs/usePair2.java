package Programs;

import UDClasses.Pair;

public class usePair2 {
    
    public static void main(String args[]){
        Pair<String, String> p = new Pair<>("Yasir", "Khan");
        p.setFirst("Md");
        System.out.println(p.getFirst() + " " + p.getSecond());

        Pair<Pair<String, String>, Integer> p2 = new Pair<>(p, 2);
        System.out.println("1st input : " + p2.getFirst().getFirst());
    }
}
