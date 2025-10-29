public class SmartOOps {
    public static void main(String[] args) {

        SmartDevice light = (n) -> {
            if (n) System.out.println("Light ON ");
            else System.out.println("Light OFF");
        };

        SmartDevice ac = (n) -> {
            if (n) System.out.println("AC ON ");
            else System.out.println("AC OFF ");
        };

        SmartDevice tv = (n) -> {
            if (n) System.out.println("TV ON ");
            else System.out.println("TV OFF");
        };

        light.control(true);
        tv.control(true);
        light.control(false);
    }
    public interface SmartDevice {
        void control(boolean n);
    }
}
