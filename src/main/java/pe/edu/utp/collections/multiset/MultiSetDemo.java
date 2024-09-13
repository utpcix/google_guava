package pe.edu.utp.collections.multiset;

import com.google.common.collect.*;
import pe.edu.utp.model.Software;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MultiSetDemo {

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

        // Implementations:
        /*   ImmutableMultiset
             ImmutableSortedMultiset
             HashMultiset
             LinkedHashMultiset
             TreeMultiset
             ConcurrentHashMultiset
        */
        //Multiset<Software> store = HashMultiset.create();
        Multiset<Software> store = LinkedHashMultiset.create();
        store.addAll(lista);

        // 1. Store contains Software 1 ?
        System.out.println("store.contains(s1) = " + store.contains(s1));
        // 2. How many copies of Software 1 ?
        System.out.println("store.count(s1) = " + store.count(s1));

        // 3. Remove 1 copy of software 4
        store.remove(s4);
        System.out.println("store.count(s4) = " + store.count(s4));
        store.remove(s4);
        store.remove(s4);
        store.setCount(s4,10); // add 10 software 4 in store
        System.out.println("store.contains(s4) = " + store.contains(s4));
        System.out.println("store.count(s4) = " + store.count(s4));

        int res = store.setCount(s4, 20);

        System.out.println("List All Items");
        store.forEach(System.out::println);

        System.out.println("store.size() = " + store.size());
        System.out.println("store.contains(s5) = " + store.contains(s5));
        System.out.println("store.count(s5) = " + store.count(s5));

        System.out.println(store.isEmpty());
        System.out.println("store.contains(s1) = " + store.contains(s1));
        System.out.println("store.contains(s5) = " + store.contains(s5));
        System.out.println("store.containsAll(lista) = " + store.containsAll(lista));

        System.out.println("res = " + res);

        Set<Software> softwareSet = store.elementSet();

        Set<Multiset.Entry<Software>> entries = store.entrySet();


        softwareSet.clear();
    }
}
