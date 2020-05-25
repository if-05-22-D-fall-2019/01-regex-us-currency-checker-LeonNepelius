import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UsCurrencyChecker {
    static Matcher getMatcher(String usCurrencyString) {
        Pattern pattern = Pattern.compile("\\$\\s?\\d+(\\.\\d{1,2})?");
        return pattern.matcher(usCurrencyString);
    }
}
