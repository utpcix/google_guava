package pe.edu.utp.base.converters;

import com.google.common.base.Converter;

import java.util.ArrayList;
import java.util.List;

public class ConvertStrings {

    public static void main(String[] args) {

        Converter<String,Integer> converter = new Converter<String, Integer>() {
            @Override
            protected Integer doForward(String s) {
                return Integer.parseInt(s);
            }

            @Override
            protected String doBackward(Integer integer) {
                return String.valueOf(integer);
            }
        };

        Integer convert = converter.convert("12");
        String strConvert = converter.reverse().convert(12);
        List<String> lista = new ArrayList<>(List.of("10","20","30","40"));
        Iterable<Integer> integers = converter.convertAll(lista);
        integers.forEach(System.out::println);

        Converter<String, Integer> from = Converter.from(Integer::parseInt, String::valueOf);


    }

}
