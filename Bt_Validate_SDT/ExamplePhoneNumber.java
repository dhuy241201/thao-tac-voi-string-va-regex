package Bt_Validate_SDT;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamplePhoneNumber {
    public static String PHONE_NUMBER = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$\n";

    public boolean validate(String number) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
}


