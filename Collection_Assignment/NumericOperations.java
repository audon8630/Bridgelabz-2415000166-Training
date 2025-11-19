import java.util.List;

public class NumericOperations {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }
    
    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        System.out.println("Integer sum: " + sumNumbers(intList));
        
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);
        System.out.println("Double sum: " + sumNumbers(doubleList));
    }
}