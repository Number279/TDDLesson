public class Convert {
    public static double convertLengthFromCentToInch(double centimeters) {
        return centimeters / 2.54;
    }

    public static double convertLength(double length, String unit) {
        if (unit.equalsIgnoreCase("inches")) {
            return (length * 2.4);
        }
        if (unit.equalsIgnoreCase("centimeters")){
            return (length / 2.4);
        }
        return 0;
    }
}
