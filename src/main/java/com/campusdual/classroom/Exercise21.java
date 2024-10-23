package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {


    public static Set<String> createHashSet() {
        Set<String> hashSet = new HashSet<>();
        populateSet (hashSet);
        return hashSet;

    }

    public static Set<String> createTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        populateSet(treeSet);
        return treeSet;

    }

    private static void populateSet(Set<String> set) {

        set.add("ELEMENT KPRBC");
        set.add("ELEMENT YPBTM");
        set.add("ELEMENT AADXU");
        set.add("ELEMENT RXCGJ");
        set.add("ELEMENT WYMVD");
        set.add("ELEMENT WFGEJ");
        set.add("ELEMENT TYGBS");
        set.add("ELEMENT MAPTK");
        set.add("ELEMENT GJXVE");
        set.add("ELEMENT BAFGL");

    }


    private static void printSet(Set<String> customSet) {
        for (String element : customSet) {
            System.out.println(element);
        }

    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        return set.add(elementToAdd);

    }

    public static void main(String[] args) {

        Set<String> hashSet = createHashSet();
        Set<String> treeSet = createTreeSet();

        System.out.println("HashSet");
        printSet(hashSet);

        System.out.println("\nTreeSet: ");
        printSet(treeSet);

        System.out.println("\nAñadiendo ELEMENT AAA a HashSet: ");
        addElementToSet(hashSet, "ELEMENT AAA");
        printSet(hashSet);

        System.out.println("\nAñadiendo ELEMENT AAA a TreeShet: ");
        addElementToSet(treeSet, "ELEMENT AAA");
        printSet(treeSet);

    }

}
