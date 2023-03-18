package org.example.cw2;

import java.util.Iterator;
import java.util.List;

public class ListOfDogsIterator implements Iterator<Dog> {
    private List<Dog> listOfDogIterable;
    private static int count;

    public ListOfDogsIterator(List<Dog> listOfDogIterable) {
        count = 0;
        this.listOfDogIterable = listOfDogIterable;

    }

    public static void setCount(int count) {
        ListOfDogsIterator.count = count;
    }

    @Override
    public boolean hasNext() {
        return count < listOfDogIterable.size();
    }

    @Override
    public Dog next() {
        return listOfDogIterable.get(count++);
    }
}
