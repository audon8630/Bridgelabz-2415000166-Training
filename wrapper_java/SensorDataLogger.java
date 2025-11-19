import java.util.ArrayList;

public class SensorDataLogger {
    public static void logData(double primitiveData, Double wrapperData) {
        ArrayList<Double> sensorLogs = new ArrayList<>();
        sensorLogs.add(primitiveData);
        sensorLogs.add(wrapperData);
        for (Double data : sensorLogs) {
            double value = data;
            System.out.println("Logged Temperature: " + value + " °C");
        }
    }

    public static void main(String[] args) {
        double primitiveTemp = 36.5;
        Double wrapperTemp = 37.2;
        logData(primitiveTemp, wrapperTemp);
    }
}
