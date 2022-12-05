package Transport;

public class ValidateUtil {

    public static String validateString(String value) {
        if (value != null && !value.isBlank() && !value.isEmpty()) {
            return value;
        } else {
            return "default";
        }
    }

    public static Integer validateNum(int value) {
        return Math.max(value, 0);
    }

    public static Integer validateYear(int value) {
        if (value < 2000) {
            value = 2000;
        }
        return value;
    }

    public static float validateFuel(float value) {
        return value < 0f || value > 100f ? 0f : value;
    }

}
