package pe.edu.utp.collections.immutable;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import pe.edu.utp.model.Software;

import java.util.ArrayList;
import java.util.List;

public class ImmutableSortedSetDemo {

    public static void main(String[] args) {

        Software s1 = new Software("Microsoft Office","365");
        Software s2 = new Software("HeidiSQL","12");
        Software s3 = new Software("PuTTY","1.7");
        Software s4 = new Software("MariaDB","10.5");
        List<Software> lista = new ArrayList<>(List.of(s1,s2,s3,s4));

        // Create ImmutableSet
        // Important: Software Class implements Comparable interface !
        ImmutableSortedSet<Software> software_iss = ImmutableSortedSet.copyOf(lista);

        System.out.println("Software Sorted Set");
        software_iss.forEach(System.out::println);

        System.out.println("software_iss.first() = " + software_iss.first());
        System.out.println("software_iss.last() = " + software_iss.last());
        System.out.println("software_iss.higher(s2) = " + software_iss.higher(s2));
        System.out.println("software_iss.lower(s2) = " + software_iss.lower(s2)); // null because Heidi is the lower value of all elements

        System.out.println("software_iset.hashCode() = " + software_iss.hashCode());

        // Try to alter
        try {
            software_iss.add(s1);
        } catch (Exception e) {
            System.out.println("Error: cannot alter ImmutableSortedSet");
        }

    }

}
