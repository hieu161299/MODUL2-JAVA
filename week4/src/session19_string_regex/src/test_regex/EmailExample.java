package test_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private static Pattern pattern;
    private Matcher matcher;
    public static final String Email_Regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)+$";

    public ValidateEmail() {
        pattern = Pattern.compile(Email_Regex);
    }


    public boolean validate( String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ValidateEmail validateEmail = new ValidateEmail();
        String str1 = "ndh16@gmail.com.vn";
        System.out.println(validateEmail.validate(str1));
    }


}
