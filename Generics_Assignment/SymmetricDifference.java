import java.util.*;

public class SymmetricDifference {
    public static <T> Set<T> symmetricDifference(Set<T> set1, Set<T> set2) {
        Set<T> union = new HashSet<>(set1);
        union.addAll(set2);
        
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        
        union.removeAll(intersection);
        return union;
    }
    
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        
        System.out.println("Symmetric difference: " + symmetricDifference(set1, set2));
    }
}