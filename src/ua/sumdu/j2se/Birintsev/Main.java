package ua.sumdu.j2se.Birintsev;

import ua.sumdu.j2se.Birintsev.Data;

import java.util.*;

import static ua.sumdu.j2se.Birintsev.Data.generateObjects;

/**
 * Arraylist
 * Linkedlist
 * HashSet
 * TreeSet
 * HashMap
 * TreeMap
 */
public class Main {

    public static void main(String[] args) {
        long begin;
        SomeClass [] objects = generateObjects(100000);
        List<SomeClass> list = new ArrayList<>();

        System.out.println("ArrayList");
        begin = System.currentTimeMillis();
        Utils.addElements(objects,list);
        System.out.println(new StringBuilder("Add time of ").append(objects.length).append(" elements : ").append(System.currentTimeMillis() - begin));

        begin = System.currentTimeMillis();
        Utils.getElements(list,objects);
        System.out.println(new StringBuilder("Get time of ").append(objects.length).append(" elements : ").append(System.currentTimeMillis() - begin));

        begin = System.currentTimeMillis();
        Utils.removeElements(list);
        System.out.println(new StringBuilder("Remove time of ").append(objects.length).append(" elements : ").append(System.currentTimeMillis() - begin));

        System.out.println("LinkedList");
        list = new LinkedList<>();
        begin = System.currentTimeMillis();
        Utils.addElements(objects,list);
        System.out.println(new StringBuilder("Add time of ").append(objects.length).append(" elements : ").append(System.currentTimeMillis() - begin));

        begin = System.currentTimeMillis();
        Utils.getElements(list,objects);
        System.out.println(new StringBuilder("Get time of ").append(objects.length).append(" elements : ").append(System.currentTimeMillis() - begin));

        begin = System.currentTimeMillis();
        Utils.removeElements(list);
        System.out.println(new StringBuilder("Remove time of ").append(objects.length).append(" elements : ").append(System.currentTimeMillis() - begin));

        System.out.println("HashSet");
        Set<SomeClass> set = new HashSet<>();
        begin = System.currentTimeMillis();
        Utils.addElements(objects,set);
        System.out.println(new StringBuilder("Add time of ").append(objects.length).append(" elements : ").append(System.currentTimeMillis() - begin));

        begin = System.currentTimeMillis();
        Utils.getElements(set,objects);
        System.out.println(new StringBuilder("Get time of ").append(objects.length).append(" elements : ").append(System.currentTimeMillis() - begin));

        begin = System.currentTimeMillis();
        Utils.removeElements(set);
        System.out.println(new StringBuilder("Remove time of ").append(objects.length).append(" elements : ").append(System.currentTimeMillis() - begin));

        System.out.println("TreeSet");
        set = new TreeSet<SomeClass>();
        begin = System.currentTimeMillis();
        Utils.addElements(objects,set);
        System.out.println(new StringBuilder("Add time of ").append(objects.length).append(" elements : ").append(System.currentTimeMillis() - begin));

        begin = System.currentTimeMillis();
        Utils.getElements(set,objects);
        System.out.println(new StringBuilder("Get time of ").append(objects.length).append(" elements : ").append(System.currentTimeMillis() - begin));

        begin = System.currentTimeMillis();
        Utils.removeElements(set);
        System.out.println(new StringBuilder("Remove time of ").append(objects.length).append(" elements : ").append(System.currentTimeMillis() - begin));

        System.out.println("HashMap");
        Map<Date, SomeClass> map = new HashMap();
        begin = System.currentTimeMillis();
        Utils.addElements(objects,map);
        System.out.println(new StringBuilder("Add time of ").append(objects.length).append(" elements : ").append(System.currentTimeMillis() - begin));

        begin = System.currentTimeMillis();
        Utils.getElements(map,objects);
        System.out.println(new StringBuilder("Get time of ").append(objects.length).append(" elements : ").append(System.currentTimeMillis() - begin));

        begin = System.currentTimeMillis();
        Utils.removeElements(map);
        System.out.println(new StringBuilder("Remove time of ").append(objects.length).append(" elements : ").append(System.currentTimeMillis() - begin));

        System.out.println("TreeMap");
        map = new TreeMap<Date, SomeClass>();
        begin = System.currentTimeMillis();
        Utils.addElements(objects,map);
        System.out.println(new StringBuilder("Add time of ").append(objects.length).append(" elements : ").append(System.currentTimeMillis() - begin));

        begin = System.currentTimeMillis();
        Utils.getElements(map,objects);
        System.out.println(new StringBuilder("Get time of ").append(objects.length).append(" elements : ").append(System.currentTimeMillis() - begin));

        begin = System.currentTimeMillis();
        Utils.removeElements(map);
        System.out.println(new StringBuilder("Remove time of ").append(objects.length).append(" elements : ").append(System.currentTimeMillis() - begin));
    }



}
