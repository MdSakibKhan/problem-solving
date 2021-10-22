import java.util.HashSet;
import java.util.Set;
public class ImplementSet {
    public static void main(String []args){
        Set<Integer> set = new HashSet<Integer>();
        set.add(2);
        set.add(3);
        set.add(4);
        for(int i : set) System.out.println(i);
    }
}
