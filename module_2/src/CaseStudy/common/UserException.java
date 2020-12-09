package CaseStudy.common;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserException {
    private static final String NAME_REGEX ="^([A-Z][a-z]+ )*";
    private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static final String ID_CARD_REGEX = "^\\d{3} \\d{3} \\d{3}$";
    private static final String DATE_BIRTH_REGEX ="^\\d{2}\\/\\d{2}\\/\\d{4}$";

    private static Pattern pattern;
    private Matcher matcher;

    public boolean validName(String name){
        pattern = Pattern.compile(NAME_REGEX);
        matcher=pattern.matcher(name+" ");
        return matcher.matches();
    };
    public boolean validMail(String mail){
        pattern = Pattern.compile(NAME_REGEX);
        matcher=pattern.matcher(mail);
        return matcher.matches();
    };
    public int validGender(String gender){
        // return -1->false ; return 0 ->Male ; return 1-Female ; return 2 Unknow
        gender =gender.toLowerCase();
        switch (gender){
            case "male":
                return 0;
            case "female":
                return 1;
            case "unknown":
                return 2;
            default:
                return -1;
        }
    }
    public boolean validIdCard(String idCard){
        pattern = Pattern.compile(NAME_REGEX);
        matcher=pattern.matcher(idCard);
        return matcher.matches();

    }
    public boolean validBirthday(String birthday){
        pattern = Pattern.compile(NAME_REGEX);
        matcher=pattern.matcher(birthday);
        if(!matcher.matches()){
            return false;
        }else{
            int year = Calendar.getInstance().get(Calendar.YEAR);
            return (year - Integer.parseInt(birthday.substring(6, 9)) > 18 &&Integer.parseInt(birthday.substring(6, 9))>1900);
        }
    }
}
