package pe.edu.utp.collections.table;

import com.google.common.base.Joiner;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import pe.edu.utp.model.Laptop;
import pe.edu.utp.model.Software;

import java.util.Map;

public class TableDemo {

    public static void main(String[] args) {

        Software s1 = new Software("Microsoft Office","365");
        Software s2 = new Software("HeidiSQL","12");
        Software s3 = new Software("PuTTY","1.7");
        Software s4 = new Software("MariaDB","10.5");
        Software s5 = new Software("MySQL","8");

        Laptop l1 = new Laptop("Lenovo","IdeaPad 3");
        Laptop l2 = new Laptop("HP","15-ef2507la");

        /*
        *              _____________________________________________
        *             | Office | HeidiSQL | PuTTY | MariaDB | MySQL |
        *             -----------------------------------------------
        *   Laptop 1  |  true  |  true    | true  | true    |       |
        *   Laptop 2  |        |          |       |         | true  |
        *             -----------------------------------------------
        *
        * */

        Table<Laptop,Software, Boolean> tabla = HashBasedTable.create();
        tabla.put(l1,s1,true);
        tabla.put(l1,s2,true);
        tabla.put(l1,s3,true);
        tabla.put(l1,s4,true);
        tabla.put(l2,s5,true);

        Map<Software, Boolean> rowLaptop1 = tabla.row(l1);
        printRow(rowLaptop1, l1);
        Map<Software, Boolean> rowLaptop2 = tabla.row(l2);
        printRow(rowLaptop2, l2);

        System.out.println("tabla.size() = " + tabla.size());
        System.out.println("tabla.isEmpty() = " + tabla.isEmpty());
        System.out.println("tabla.containsRow(l1) = " + tabla.containsRow(l1));
        System.out.println("tabla.containsColumn(s1) = " + tabla.containsColumn(s1));
        


    }

    private static void printRow(Map<Software, Boolean> rowLaptop1, Laptop laptop) {
        String joinSw = Joiner.on(",").join(rowLaptop1.keySet());
        String format = String.format("%s (%s) -> %s",
                laptop.getBrand(),
                laptop.getModel(),
                joinSw);
        System.out.println(format);
    }
}
