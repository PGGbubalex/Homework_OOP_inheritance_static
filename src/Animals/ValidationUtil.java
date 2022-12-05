package Animals;

public class ValidationUtil {


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
}
