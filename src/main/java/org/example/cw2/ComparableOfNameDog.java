package org.example.cw2;

import java.util.Comparator;

/**
 * Класс сортировки по имени собаки
 */
public class ComparableOfNameDog <T extends Animal> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }


}
