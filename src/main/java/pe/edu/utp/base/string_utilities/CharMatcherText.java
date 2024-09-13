package pe.edu.utp.base.string_utilities;

import com.google.common.base.CharMatcher;

public class CharMatcherText {

    public static void main(String[] args) {

        // 1. Extraer dígitos
        String data = "U21432454";
        String solo_digitos = CharMatcher.digit().retainFrom(data);

        System.out.println(solo_digitos);

        // 2. Remover dígitos
        String codigo = "U21432454";
        String letra = CharMatcher.digit().removeFrom(codigo);

        System.out.println("CharMatcher.digit().removeFrom(codigo) = " + letra);

        // 3. Contar digitos en cadena
        System.out.println("CharMatcher.digit().countIn(data) = " + CharMatcher.digit().countIn(data));

        // 4. Reemplazar dígitos
        System.out.println("CharMatcher.digit().replaceFrom(data,\"digitos\") = " + CharMatcher.digit().replaceFrom(data, "#"));

        // 5. Colapsar dígitos
        System.out.println("CharMatcher.digit().collapseFrom(data,\"#\") = " + CharMatcher.digit().collapseFrom(data, '#'));

        // 6. Eliminar espacios (trim)
        String info = "          GOOGLE        GUAVA          ";
        System.out.println("CharMatcher.whitespace().trimFrom(info) = " + CharMatcher.whitespace().trimFrom(info));
        System.out.println("CharMatcher.whitespace().trimLeadingFrom(info) = " + CharMatcher.whitespace().trimLeadingFrom(info));
        System.out.println("CharMatcher.whitespace().removeFrom(info) = " + CharMatcher.whitespace().removeFrom(info));
        String info_trim = CharMatcher.whitespace().trimFrom(info); // Eliminar espacios al inicio y al final
        System.out.println("CharMatcher.whitespace().collapseFrom(info_trim,' ') = " + CharMatcher.whitespace().collapseFrom(info_trim, ' '));

    }

}
