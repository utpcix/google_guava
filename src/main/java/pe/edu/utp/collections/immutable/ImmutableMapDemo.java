package pe.edu.utp.collections.immutable;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import pe.edu.utp.model.Software;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class ImmutableMapDemo {

    public static void main(String[] args) {

        Software s1 = new Software("Microsoft Office","365");
        Software s2 = new Software("HeidiSQL","12");
        Software s3 = new Software("PuTTY","1.7");
        Software s4 = new Software("MariaDB","10.5");
        HashMap<String, Software> map = new LinkedHashMap<>();

        map.put("office",s1);
        map.put("sql", s2);
        map.put("putty", s3);
        map.put("db", s4);

        // Create ImmutableSet
        ImmutableMap<String,Software> software_map = ImmutableMap.copyOf(map);

        System.out.println("software_map.get(\"sql\") = " + software_map.get("sql"));
        System.out.println("software_map.get(\"db\") = " + software_map.get("db"));
        System.out.println("software_map.containsValue(s3) = " + software_map.containsValue(s3));
        System.out.println("software_map.isEmpty() = " + software_map.isEmpty());


    }

}
