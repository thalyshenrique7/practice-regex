package camelCase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CamelCaseRegex {
    public static void main(String[] args) {

        String camelCase = "oLa MuNdO";

        String camelCaseRegex = "^(?:[a-zA-Z]+(?:\\\\s[a-zA-Z]+)*)$";

        Pattern pattern = Pattern.compile(camelCaseRegex);

        Matcher matcher = pattern.matcher(camelCase.replaceAll("\\s+", ""));

        if(matcher.matches()){
            System.out.println("Camel Case identified");
        } else {
            System.out.println("Camel Case not found");
        }
    }
}
