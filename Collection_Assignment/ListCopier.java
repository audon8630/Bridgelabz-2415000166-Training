import java.util.List;
import java.util.ArrayList;

public class ListCopier {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number num : src) {
            dest.add(num);
        }
    }
    
    public static void main(String[] args) {
        List<Number> destination = new ArrayList<>();
        List<Integer> sourceInt = List.of(1, 2, 3);
        List<Double> sourceDouble = List.of(1.5, 2.5, 3.5);
        
        copyList(destination, sourceInt);
        copyList(destination, sourceDouble);
        
        System.out.println("Copied list: " + destination);
    }
}