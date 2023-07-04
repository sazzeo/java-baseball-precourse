package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternUtils {
    private static final Pattern NUMBER_REGEX = Pattern.compile("^\\d+$");

    public static boolean isNumber(final String inputNumber) {
        Matcher matcher = NUMBER_REGEX.matcher(inputNumber);
        return matcher.find();
    }
}
