package pe.edu.utp.collections.multiset;

import com.google.common.collect.SortedMultiset;
import com.google.common.collect.TreeMultiset;
import pe.edu.utp.model.Software;

import java.util.ArrayList;
import java.util.List;

public class SortedMultiSetDemo {

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

        // Implementations
        // All Known Implementing Classes:
        // ForwardingSortedMultiset,
        // ForwardingSortedMultiset.StandardDescendingMultiset,
        // ImmutableSortedMultiset,
        // TreeMultiset
        SortedMultiset<Software> bag = TreeMultiset.create();
        bag.addAll(lista);
        bag.forEach(System.out::println);


    }
}
