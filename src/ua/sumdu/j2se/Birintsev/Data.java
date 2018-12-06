package ua.sumdu.j2se.Birintsev;

public class Data {

    private Data(){}

    public static SomeClass [] generateObjects(int count){
        SomeClass [] array = new SomeClass[count];
        for(int i = 0; i < count; i++){
            array[i] = new SomeClass(i);
        }
        return array;
    }
}
