package phone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneRegex {
    public static void main(String[] args) {

        String phone = "(83) 98877-1010";

        String phoneRegex = "([(][0-9]{2}[)]\\s[0-9]{5}-[0-9]{4})";

        Pattern pattern = Pattern.compile(phoneRegex);

        Matcher matcher = pattern.matcher(phone);

        if(matcher.matches()){
            System.out.println("Phone number is valid");
        } else {
            System.out.println("Phone number is invalid");
        }
    }
}
