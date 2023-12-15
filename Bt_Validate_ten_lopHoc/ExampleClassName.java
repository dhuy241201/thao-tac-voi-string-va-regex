package Bt_Validate_ten_lopHoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleClassName {
    String CLASS_NAME_REGEX = "^[CAP]\\d{4}[GHIK]$";
    public boolean validate(String name){
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
