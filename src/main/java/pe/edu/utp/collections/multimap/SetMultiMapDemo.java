package pe.edu.utp.collections.multimap;

import com.google.common.collect.SetMultimap;
import com.google.common.collect.TreeMultimap;
import pe.edu.utp.model.Laptop;
import pe.edu.utp.model.Software;

import java.util.ArrayList;
import java.util.List;

public class SetMultiMapDemo {

    public static void main(String[] args) {

        Software s1 = new Software("Microsoft Office","365");
        Software s2 = new Software("HeidiSQL","12");
        Software s3 = new Software("PuTTY","1.7");
        Software s4 = new Software("MariaDB","10.5");
        Software s5 = new Software("MySQL","8");
        List<Software> lista = new ArrayList<>(
                List.of(s1,s1,s1, // 3 en stock
                        s2,s2,s2, // 3 en stock
                        s3,s3,    // 2 en stock
                        s4));     // 1 en stock

        Laptop l1 = new Laptop("Lenovo","IdeaPad 3");
        Laptop l2 = new Laptop("HP","15-ef2507la");

        /*
        * All Known Implementing Classes:
        *    ForwardingSetMultimap,
        *    ForwardingSortedSetMultimap,
        *    HashMultimap,
        *    ImmutableSetMultimap,
        *    LinkedHashMultimap,
        *    TreeMultimap
        * */

        // SetMultiMap
        /*
         *    sw1 -> [s1,s2,s3,s4}
         *    sw2 -> [s5]
         *
         * */
        System.out.println("SetMultiMap");
        //SetMultimap<Laptop, Software> inventorySet = MultimapBuilder.hashKeys().treeSetValues().build();
        SetMultimap<Laptop, Software> inventorySet = TreeMultimap.create();
        inventorySet.putAll(l1,lista);
        inventorySet.put(l2,s5);
        for (Laptop laptop : inventorySet.keySet()) {
            String format = String.format("%s (%s) -> %s",
                    laptop.getBrand(),
                    laptop.getModel(),
                    inventorySet.get(laptop));
            System.out.println(format);
        }

    }
}
