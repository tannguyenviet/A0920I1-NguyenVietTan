package B19_string_regex.ValidatePhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        final String PHONE_REGEX = "^[(]\\d{2}[)][-][(][0]\\d{9}[)]$";
        Pattern pattern;
        Matcher matcher;
        String st ="(84)-(0978489648)";
        String st1 ="(a4)-(0978489648)";
        pattern=Pattern.compile(PHONE_REGEX);
        System.out.println(pattern.matcher(st).matches());
        System.out.println(pattern.matcher(st1).matches());

    }
}
