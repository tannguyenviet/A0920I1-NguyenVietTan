package CaseStudy.common;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    private static final String ID_REGEX =   "SV\\w{2}-\\d{4}";
    private static final String NAME_REGEX ="^[A-Z]{1}[a-z]*";
    private static final String DATE_BIRTH_REGEX ="^\\d{2}\\/\\d{2}\\/\\d{4}$";

    private static Pattern pattern;
    private Matcher matcher;

    public boolean validateId(String id){
        pattern=Pattern.compile(ID_REGEX);
        matcher = pattern.matcher(id);
        return matcher.matches();
    }
    public boolean validateName(String name){
        pattern=Pattern.compile(NAME_REGEX);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }
    public boolean validateDayBirth(String date){
        pattern=Pattern.compile(DATE_BIRTH_REGEX);
        matcher = pattern.matcher(date);
        if(!matcher.matches()){
            return false;
        }else {
            int year = Calendar.getInstance().get(Calendar.YEAR);
            return year - Integer.parseInt(date.substring(6, 9)) > 18;
        }
    }
    public boolean validateAreaPool(Double areaPool){
        return areaPool < 30;
    }
    public boolean validateRentCost(int rentCost){
        return rentCost >= 0;
    }
    public boolean validateMaxPeople(int maxPeople){
        return maxPeople > 0 && maxPeople < 20;
    }
    public boolean validateFreeService(String freeServices){
        return freeServices.equals("massage") || freeServices.equals("karaoke") || freeServices.equals("food") || freeServices.equals("drink");
    }
    public boolean validateFloor(int floor){
        return floor > 0;
    }

}
