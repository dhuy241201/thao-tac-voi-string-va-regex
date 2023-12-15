package Th_Validate_account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    Pattern pattern;
    Matcher matcher;
    public static String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    public boolean validate(String account){
        pattern = Pattern.compile(ACCOUNT_REGEX);
        matcher = pattern.matcher(account);
        return matcher.matches();

    }
}
