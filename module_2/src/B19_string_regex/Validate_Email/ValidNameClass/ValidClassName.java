package String_Regex.Validate_Email.ValidNameClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidClassName {
    public static void main(String[] args) {
        // \\d{4} tiếp theo là 4 số 
        final String CLASS_REGEX = "^[C|A|P]\\d{4}[G|H|I|K|L|M]$";
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher;
        String test = "A03824M";
        System.out.println(pattern.matcher(test).matches());
    }
}
