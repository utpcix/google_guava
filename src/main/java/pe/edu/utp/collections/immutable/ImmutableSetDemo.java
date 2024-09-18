package pe.edu.utp.collections.immutable;

import com.google.common.collect.ImmutableSet;
import pe.edu.utp.model.Software;

import java.util.ArrayList;
import java.util.List;

public class ImmutableSetDemo {

    public static void main(String[] args) {

        Software s1 = new Software("Microsoft Office","365");
        Software s2 = new Software("HeidiSQL","12");
        Software s3 = new Software("PuTTY","1.7");
        Software s4 = new Software("MariaDB","10.5");
        List<Software> lista = new ArrayList<>(List.of(s1,s2,s3,s4));

        // Create ImmutableSet
        ImmutableSet<Software> software_iset = ImmutableSet.copyOf(lista);

        System.out.println("Software Set");
        software_iset.forEach(System.out::println);

        System.out.println("software_iset.hashCode() = " + software_iset.hashCode());

        // Try to alter
        try {
            software_iset.add(s1);
        } catch (Exception e) {
            System.out.println("Error: cannot alter ImmutableSet");
        }

    }

}
