import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;


public class ArrList_TreeSet {

    public static void main(String[] args) {
        
        List<Integer> arrli = new ArrayList<>();
        arrli.add(14);
        arrli.add(13);
        arrli.add(12);
        arrli.add(11);
        System.out.println(arrli);
        TreeSet<Integer> trst = new TreeSet<>(arrli);
        System.out.println(trst);
    }
}
