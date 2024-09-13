package pe.edu.utp.base.string_utilities;

import com.google.common.base.Ascii;
import com.google.common.base.Strings;

public class StringsDemo {
    public static void main(String[] args) {

        System.out.println(Strings.repeat("#", 40));

        System.out.println(Strings.lenientFormat("Nombre:%s " +
                "- Edad:%s " +
                "- Saldo:S/.%s",
                "Juan",
                19,
                1200.56f));

        System.out.println(Strings.repeat("#", 40));
        System.out.println("Ticket: " + Strings.padStart("10", 5, '0'));
        System.out.println(Strings.padEnd("CARLOS",13,'*'));

        System.out.println(Strings.commonPrefix("linuxDebian", "linuxFedora"));
        System.out.println(Strings.isNullOrEmpty(null));

//        // Sin LenientFormat
        String nombre = "Fernando";
        int edad = 19;
        float saldo = 500.0f;
        String msg = "Nombre: %s, Edad: %d, Saldo: %f%n";
        System.out.printf(msg,
                nombre,
                edad,
                saldo);

        // Con LeninentFormat
        String nombre_lf = "Fernando";
        int edad_lf = 19;
        float saldo_lf = 500.0f;
        String msg_lf = "Nombre: %s, Edad: %s, Saldo: %s%n";
        System.out.printf(msg_lf,
                nombre_lf,
                edad_lf,
                saldo_lf);

    }
}
