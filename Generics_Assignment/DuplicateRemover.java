import java.util.*;

public class DuplicateRemover {
    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> seen = new LinkedHashSet<>();
        List<T> result = new ArrayList<>();
        
        for (T item : list) {
            if (seen.add(item)) {
                result.add(item);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> unique = removeDuplicates(numbers);
        System.out.println("After removing duplicates: " + unique);
    }
}