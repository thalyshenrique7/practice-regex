package cpf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CpfRegex {
    public static void main(String[] args) {

        String cpf = "12345678910";

        String cpfRegex = ("^[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}");

        Pattern pattern = Pattern.compile(cpfRegex);

        Matcher matcher = pattern.matcher(cpf);

        if(matcher.matches()){
            System.out.println("Cpf is valid");
        } else {
            System.out.println("Cpf is invalid");
        }
    }
}
