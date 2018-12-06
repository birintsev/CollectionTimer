package ua.sumdu.j2se.Birintsev;

import java.util.Objects;

public class SomeClass implements Comparable<SomeClass> {
    int id;
    String name;

    public SomeClass(int id) {
        this.id = id;
        this.name = new StringBuilder((char)id).append((char)((id*id)%65536)).toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomeClass someClass = (SomeClass) o;
        return id == someClass.id &&
                name.equals(someClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(SomeClass o) {
        if(id < o.id) return -1;
        else if(id > o.id) return 1;
        else return 0;
    }
}
