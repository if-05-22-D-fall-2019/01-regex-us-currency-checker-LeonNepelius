import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsCurrencyChecker {
    public static Matcher getMatcher(String usCurrencyString) {
        Pattern pattern = Pattern.compile(""); //TODO regex
        return pattern.matcher(usCurrencyString);
    }
}
