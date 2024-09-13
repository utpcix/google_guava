package pe.edu.utp.base.converters;

import com.google.common.base.Converter;
import pe.edu.utp.model.OS;
import pe.edu.utp.model.Software;

import java.util.ArrayList;
import java.util.List;

public class ConvertDemo {

    public static void main(String[] args) {

        OS os1 = new OS("Linux", "6.0");
        OS os2 = new OS("FreeBSD", "14");
        OS os3 = new OS("Windows", "11");
        OS os4 = new OS("MacOS","12");

        List<OS> lista = new ArrayList<>(List.of(os1,os2,os3,os4));

        Converter<OS, Software> converter = Converter
                .from(Software::valueOf, OS::valueOf);

        // Convertir instancias OS a Software
        Iterable<Software> softwares = converter.convertAll(lista);
        softwares.forEach(System.out::println);

        // Conversión inversa de Software a OS
        Iterable<OS> os_list = converter.reverse().convertAll(softwares);
        os_list.forEach(System.out::println);

        Software sw1 = converter.convert(os1);
        System.out.println(sw1);

    }

}
