package barcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BarCodeRegex {
    public static void main(String[] args) {


        String barCode = "11001100100000000000110011001101010101011010";

        String barCodeRegex = "^(\\d{44})$";

        Pattern pattern = Pattern.compile(barCodeRegex);

        Matcher matcher = pattern.matcher(barCode);

        if(matcher.matches()) {
            System.out.println("Barcode is valid");
        } else {
            System.out.println("Barcode is invalid");
        }
    }
}
