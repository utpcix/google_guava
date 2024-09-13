package pe.edu.utp.model;

import java.util.Comparator;

public class Software implements Comparable<Software> {
    public static final Comparator<Software> SOFTWARE_COMPARATOR_NATURAL_ORDER = Comparator.comparing(Software::getName).thenComparing(Software::getVersion);
    private final String name;
    private final String version;


    public Software(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public static Software valueOf(OS os){
        return new Software(os.getName(),os.getVersion());
    }

    @Override
    public String toString() {
        return "Software{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public int compareTo(Software o) {
        return SOFTWARE_COMPARATOR_NATURAL_ORDER.compare(this, o);
    }
}
