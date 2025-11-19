import java.util.*;

public class SetToSortedList {
    public static List<Integer> convertToSortedList(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
    
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        List<Integer> sortedList = convertToSortedList(numbers);
        System.out.println("Sorted list: " + sortedList);
    }
}