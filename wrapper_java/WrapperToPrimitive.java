public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double obj = 45.67;

        double d = obj.doubleValue();
        int i = (int) obj.doubleValue();

        System.out.println("Double object: " + obj);
        System.out.println("Primitive double: " + d);
        System.out.println("Primitive int (casted): " + i);
    }
}
