package pe.edu.utp.model;

import java.util.Comparator;

public class OS implements Comparable<OS> {
    public static final Comparator<OS> OS_COMPARATOR_NATURAL_ORDER = Comparator.comparing(OS::getName).thenComparing(OS::getVersion);
    private final String name;
    private final String version;


    public OS(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public static OS valueOf(Software software){
        return new OS(software.getName(), software.getVersion());
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "OS{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }

    @Override
    public int compareTo(OS o) {
        return OS_COMPARATOR_NATURAL_ORDER.compare(this, o);
    }
}
