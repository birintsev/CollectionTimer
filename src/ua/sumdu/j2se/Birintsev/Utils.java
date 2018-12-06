package ua.sumdu.j2se.Birintsev;

import java.util.*;

public class Utils {

    private Utils(){}

    public static <T> void addElements(T[] from, Collection<T> to){
        for(int i = 0; i < from.length; i++){
            to.add(from[i]);
        }
    }

    public static <T> boolean getElements(Collection<T> from, T[] to){
        if(from.size() <= to.length){
            int i = 0;
            for(T t : from){
                to[i] = t;
                i++;
            }
            return true;
        }
        return false;
    }

    public static <T> void removeElements(Collection<T> collection){
        Iterator<T> iterator = collection.iterator();
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
    }

    public static <V> void addElements(V[] from, Map<Date, V> to){
        for(int i = 0; i < from.length; i++){
            to.put(new Date(i),from[i]);
        }
    }

    public static <V> boolean getElements(Map<Date, V> from, V[] to) {
        if(from.size() <= to.length){
            Set<Date> keys = from.keySet();
            int i = 0;
            for(Date date : keys){
                to[i] = from.get(date);
            }
            return true;
        }
        return false;
    }

    public static <V> void removeElements(Map<Date ,V> from){
        Set<Date> keys = from.keySet();
        Iterator<Date> iterator = keys.iterator();
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
    }
}
