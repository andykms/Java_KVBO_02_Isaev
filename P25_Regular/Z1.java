import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Z1 {
    public static void main(String[] args) {
        String str = "abcdefghijklmnoasdfasdpqrstuv18340.";
        Pattern pattern = Pattern.compile("[a-zA-Z]+|\\d+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}