package utils;

public class StringUtils {
    public static String join(String delimiter, String... strArr) {
        int strArrSize = strArr.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArrSize; i++) {
            sb.append(strArr[i]);
            if (i != strArrSize - 1) {
                sb.append(delimiter);
            }
        }
        return sb.toString();
    }
}
