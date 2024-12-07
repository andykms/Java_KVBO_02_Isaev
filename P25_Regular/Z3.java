import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Z3 {
    public static void main(String[] args) {
        String text = "Prices: 25.98 USD, 100 RUB, 10.50 EU.";
        Pattern pattern = Pattern.compile("\\d+\\.\\d+ (USD|RUB|EU)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}