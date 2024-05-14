package ch.epai.ict.m404.stock;

public class StringUtils {
    public static String emptyStringIfNull(String value) {
        if (value != null) {
            return value;
        }
        return "";
    }
}
