package pe.edu.utp.collections.bimap;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import pe.edu.utp.model.Software;

import java.util.Set;

public class BiMapDemo {

    public static void main(String[] args) {

        Software s1 = new Software("Linux","6");
        Software s2 = new Software("FreeBSD","14");

        /*
        * All Known Implementing Classes:
        *    EnumBiMap,
        *    EnumHashBiMap,
        *    HashBiMap,
        *    ImmutableBiMap
        * */

        BiMap<String,Software> softwareBiMap = HashBiMap.create();
        softwareBiMap.put("linux",s1);
        softwareBiMap.put("truenas",s2);

        System.out.println("softwareBiMap.get(\"linux\") = " + softwareBiMap.get("linux"));
        System.out.println("softwareBiMap.inverse().get(s2) = " + softwareBiMap.inverse().get(s2));

        //softwareBiMap.put("centos",s1); // error

        Set<Software> values = softwareBiMap.values();

        System.out.println("softwareBiMap.size() = " + softwareBiMap.size());
        System.out.println("softwareBiMap.isEmpty() = " + softwareBiMap.isEmpty());
        System.out.println("softwareBiMap.containsKey(s1) = " + softwareBiMap.containsKey(s1));
        System.out.println("softwareBiMap.containsValue(\"linux\") = " + softwareBiMap.containsValue("linux"));

        System.out.println("softwareBiMap.remove(\"linux\") = " + softwareBiMap.remove("linux"));




    }

}
