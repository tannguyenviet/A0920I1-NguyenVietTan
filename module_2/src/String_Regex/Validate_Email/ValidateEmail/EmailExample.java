package String_Regex.Validate_Email.ValidateEmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        public EmailExample(){
        pattern= Pattern.compile(EMAIL_REGEX);
    }
    public boolean  validate(String st){
        matcher = pattern.matcher(st);
        return matcher.matches();
    }
}
