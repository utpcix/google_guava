package pe.edu.utp.collections.immutable;

public class ImmutableCollectionDemo {

    public static void main(String[] args) {

        // From: https://guava.dev/releases/snapshot-jre/api/docs/com/google/common/collect/ImmutableCollection.html
        // Warning: avoid direct usage of ImmutableCollection as a type (just as with Collection itself).
        // Prefer subtypes such as ImmutableSet or ImmutableList, which have well-defined
        // Object.equals(java.lang.Object) semantics, thus avoiding a common source of bugs and confusion.

        System.out.println("Warning: avoid direct usage of ImmutableCollection as a type");
        System.out.println("Prefer subtypes such as ImmutableSet or ImmutableList, which have well-defined");
        System.out.println("Obey :)");

    }

}
