package pe.edu.utp.collections.multimap;

import pe.edu.utp.model.Laptop;
import pe.edu.utp.model.Software;

public class Reporte {

    public static void printAsJSON(Laptop laptop, Software sw){

        String template = """
                    {
                        "name": "%s",
                        "version": "%s"
                    }
                """;

        String json = String.format(template, sw.getName(), sw.getVersion());

        System.out.println(json);

    }

}
