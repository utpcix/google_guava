package pe.edu.utp.collections.immutable;

import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSortedMultiset;
import pe.edu.utp.model.Software;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ImmutableSortedMultiSetDemo {

    public static void main(String[] args) {

        // Instances
        Software s1 = new Software("Microsoft Office","365");
        Software s2 = new Software("HeidiSQL","12");
        Software s3 = new Software("PuTTY","1.7");
        Software s4 = new Software("MariaDB","10.5");
        Software s5 = new Software("IntelliJ IDEA","2024.2.1");

        // ArrayList of softwares
        List<Software> lista = new ArrayList<>(
                List.of(s1, // 1 instance of s1
                        s2,s2, // 2 instances of s2
                        s3,s3,s3,s3, // 4 instances of s3
                        s4,s4,s4,s4,s4,s4,s4) // 7 instances of s4
        );

        // Create ImmutableSortedMultiset (in reverse order)
        // Important: Software Class implements Comparable interface !
        Comparator<Software> reverseOrder = Comparator.comparing(Software::getName).reversed();
        ImmutableSortedMultiset<Software> ims_software = ImmutableSortedMultiset.copyOf(reverseOrder, lista);

        // Show Sorted Multiset
        System.out.println("----------------------------------------");
        System.out.println("Software Sorted MultiSet (Reverse order)");
        System.out.println("----------------------------------------");
        ims_software.forEach(System.out::println);

        // Get count of s4
        System.out.println("ims_software.count(s4) = " + ims_software.count(s4));

        // Check if s1 is inside of the Multiset
        System.out.println("ims_software.contains(s1) = " + ims_software.contains(s1));

        // Check if s5 is inside of the Multiset
        System.out.println("ims_software.contains(s5) = " + ims_software.contains(s5));



    }

}
