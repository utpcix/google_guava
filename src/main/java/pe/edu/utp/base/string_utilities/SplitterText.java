package pe.edu.utp.base.string_utilities;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;

import java.util.Arrays;
import java.util.Map;

public class SplitterText {

    public static void main(String[] args) {

        // Splitter
        System.out.println("Splitter común");

        String ciudades = "Cix,Lima,Aqp";
        Iterable<String> splitCity = Splitter.on(",").split(ciudades);

        splitCity.forEach(item -> System.out.println("city->"+item));

        // Que pasa si quitamos la x ?
        String data = ",Cix,,  Lima  ,Aqp,,,,,,,Iqt,";
        String[] split = data.split(",");
        Arrays.stream(split).forEach(item -> System.out.println("item->"+item));

        // Splitter
        System.out.println("Splitter (Trim results and omit Empty Strings)");

        String dataCity = ",Cix,,  Lima  ,Aqp,,,,,,,Iqt,";
        Iterable<String> newSplit = Splitter.on(",").trimResults().omitEmptyStrings()
                .split(dataCity);

        newSplit.forEach(item -> System.out.println("new item->"+item));

        System.out.println("Multiple separators");
        // Multiples separadores
        data = "|a;-  b  -c;;,,,,/x,";
        newSplit = Splitter.on(CharMatcher.anyOf(";,.-/|"))
                .trimResults()
                .omitEmptyStrings()
                .split(data);

        newSplit.forEach(item -> System.out.println("new item->"+item));

        System.out.println("Limit results");
        newSplit = Splitter.on(CharMatcher.anyOf(";,.-/|"))
                .trimResults()
                .omitEmptyStrings()
                .limit(3)
                .split(data);

        newSplit.forEach(item -> System.out.println("new item->"+item));

        System.out.println("Fixed split");
        data = "winlinbsdmac";
        newSplit = Splitter.fixedLength(3).split(data);
        newSplit.forEach(item -> System.out.println("new item->"+item));

        System.out.println("Key Value split");
        data = "name=Juan,age=19,course=Java";
        Map<String, String> splitMap = Splitter.onPattern(",")
                .withKeyValueSeparator("=")
                .split(data);

        splitMap.keySet().forEach(key -> System.out.printf("%s->%s%n",key,splitMap.get(key)));

    }

}
