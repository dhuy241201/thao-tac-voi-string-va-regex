package Bt_Validate_SDT;

import Bt_Validate_ten_lopHoc.ExampleClassName;

public class Main {
    public static void main(String[] args) {

        String[] phonenumber = new String[]{"840978489648", "a822222222", "8422b22222", "849978489648"};
        ExamplePhoneNumber example = new ExamplePhoneNumber();
        for (String number : phonenumber) {
            System.out.println("Number " + number + " : " + example.validate(number));
        }
    }
}
