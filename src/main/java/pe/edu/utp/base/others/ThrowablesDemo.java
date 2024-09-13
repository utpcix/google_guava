package pe.edu.utp.base.others;

import com.google.common.base.CharMatcher;
import com.google.common.base.Strings;

import static com.google.common.base.Throwables.throwIfInstanceOf;
import static com.google.common.base.Throwables.throwIfUnchecked;

public class ThrowablesDemo {

    public static void printUTPCode(String value) throws InvalidUTPCode {
        boolean res = false;
        if (value == null){
            throw new IllegalArgumentException("value cannot be null");
        }
        String digit = CharMatcher.digit().retainFrom(value);
        boolean isValidLengthDigit = digit.length() == 8;
        String letter = CharMatcher.digit().removeFrom(value);
        boolean isValidLetter = letter.toUpperCase().equals("U");
        boolean isValidUTPCode = isValidLetter && isValidLengthDigit;

        if (!isValidUTPCode){
            throw new InvalidUTPCode(String.format("%s es un código invalido", value));
        }

        System.out.println("value = " + value);

    }

    public static void printAll(String value) throws InvalidUTPCode {
        try {
            System.out.println(Strings.repeat("#", 30));
            printUTPCode(value);
            System.out.println(Strings.repeat("#", 30));
        } catch (InvalidUTPCode | IllegalArgumentException e) {
            throwIfInstanceOf(e, InvalidUTPCode.class);
            throwIfUnchecked(e);
            throw new AssertionError(e);
        }
    }

    public static void main(String[] args) throws InvalidUTPCode {

       //printAll(null);
       //printAll("U25454649");
       //printAll("25454649"); // falta U
       printAll("U2545464"); // falta 1 dígito

    }
}
