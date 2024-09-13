package pe.edu.utp.base.string_utilities;

import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class JoinerText {

    public static void main(String[] args) {

        StringJoiner sj = new StringJoiner(";");
        sj.add("Juan");
        sj.add(null);
        sj.add("Ana");
        sj.add("Rosa");
        System.out.println(sj);

        Joiner joiner = Joiner.on(";").skipNulls();
        System.out.println(joiner.join("Juan", null, "Ana", "Rosa"));

        List<String> lista = new ArrayList<>(List.of("Juan","Ana","Rosa","Carlos"));
        System.out.println(joiner.join(lista.iterator()));

        System.out.println(joiner.join("Gaby", 19,500.5f, true));



    }
}
