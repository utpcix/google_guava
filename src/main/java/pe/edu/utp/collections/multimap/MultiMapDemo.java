package pe.edu.utp.collections.multimap;

import com.google.common.collect.*;
import pe.edu.utp.model.Laptop;
import pe.edu.utp.model.Software;

import java.util.ArrayList;
import java.util.List;

public class MultiMapDemo {

    public static void main(String[] args) {

        Software s1 = new Software("Office","365");
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
        *    ArrayListMultimap,
        *    ForwardingListMultimap,
        *    ForwardingMultimap,
        *    ForwardingSetMultimap,
        *    ForwardingSortedSetMultimap,
        *    HashMultimap,
        *    ImmutableListMultimap,
        *    ImmutableMultimap,
        *    ImmutableSetMultimap,
        *    LinkedHashMultimap,
        *    LinkedListMultimap,
        *    TreeMultimap
        * */

        // ListMultiMap
        /*
        *    sw1 -> [s1,s1,s1,s2,s2,s2,s3,s3,s4}
        *    sw2 -> [s5]
        *
        * */
        // Create MultiMap using Builder
        //ListMultimap<Laptop,Software> inventory = MultimapBuilder.treeKeys().arrayListValues().build();  // return ArrayListMultiMap
        Multimap<Laptop,Software> inventory = LinkedListMultimap.create();

        inventory.putAll(l1,lista);
        inventory.put(l2,s5);

        System.out.println("MultiMap");
        for (Laptop laptop : inventory.keySet()) {
            String format = String.format("%s (%s) -> %s",
                    laptop.getBrand(),
                    laptop.getModel(),
                    inventory.get(laptop));
            System.out.println(format);
        }

        System.out.println(inventory.isEmpty());

        System.out.println(inventory.size());

        System.out.println("inventory.containsKey(s1) = " + inventory.containsKey(l1));
        System.out.println("inventory.containsValue(s1) = " + inventory.containsValue(s1));
        System.out.println("inventory.containsEntry(l2,s1) = " + inventory.containsEntry(l2, s1));

        inventory.forEach(Reporte::printAsJSON);


    }
}
