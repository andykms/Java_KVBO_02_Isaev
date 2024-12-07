import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Z4 {
    public static void main(String[] args) {
        String text = "(1 + 8) - 9 / 4 is a valid expression, while 6 / 5 - 2 * 9 is not.";
        Pattern pattern = Pattern.compile("\\b\\d+\\b(?!\\+)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}