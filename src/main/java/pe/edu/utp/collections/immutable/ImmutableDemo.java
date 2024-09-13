package pe.edu.utp.collections.immutable;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import pe.edu.utp.model.Software;

import java.util.ArrayList;
import java.util.List;

public class ImmutableDemo {
    public static void main(String[] args) {

        Software s1 = new Software("Microsoft Office","365");
        Software s2 = new Software("HeidiSQL","12");
        Software s3 = new Software("PuTTY","1.7");
        Software s4 = new Software("MariaDB","10.5");
        List<Software> lista = new ArrayList<>(List.of(s1,s2,s3,s4));

        ImmutableSet<Software> softwares = ImmutableSet.of(s1, s2, s3, s4,s1,s2,s3,s4);
        //ImmutableSet<Software> softwareSet = ImmutableSet.<Software>builder().addAll(lista).build();
        //ImmutableSet<Software> softwares = ImmutableSet.copyOf(lista);

        ImmutableList<Software> swList = ImmutableList.copyOf(lista);

        System.out.println("Software Set");
        softwares.forEach(System.out::println);

        System.out.println("Software List");
        swList.forEach(System.out::println);

        ImmutableList<String> ilist = ImmutableList.<String>builder().add("Hi").build();
        //ilist.addLast("Hello");


    }
}
