package pe.edu.utp.collections.immutable;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedSet;
import pe.edu.utp.model.Software;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ImmutableSortedMapDemo {

    public static void main(String[] args) {

        Software s1 = new Software("Microsoft Office","365");
        Software s2 = new Software("HeidiSQL","12");
        Software s3 = new Software("PuTTY","1.7");
        Software s4 = new Software("MariaDB","10.5");
        HashMap<String, Software> map = new LinkedHashMap<>();

        map.put("sw_c",s1);  // Microsoft Office (3th)
        map.put("sw_d", s2); // HeidiSQL (4th)
        map.put("sw_b", s3); // PuTTY   (2nd)
        map.put("sw_a", s4); // MariaDB (1st)

        // Create ImmutableSortedMap
        ImmutableSortedMap<String,Software> software_map = ImmutableSortedMap.copyOf(map);

        // Get keys (ordered)
        System.out.println("Key List");
        ImmutableSortedSet<String> keys = software_map.keySet();
        keys.forEach(System.out::println);

        // Get values (ordered by key)
        System.out.println("Value List");
        ImmutableCollection<Software> values = software_map.values();
        values.forEach(System.out::println);


    }

}
