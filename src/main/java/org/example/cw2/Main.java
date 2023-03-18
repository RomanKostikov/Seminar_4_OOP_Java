package org.example.cw2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ListOfDogs listDogs = new ListOfDogs();
        listDogs.setListDogs(Arrays.asList(
                new Dog("Бобик", 20, "Черный"),
                new Dog("Шарик", 15, "Белый"),
                new Dog("Полкан", 7, "Красный")));
        ListOfCats listOfCats = new ListOfCats();
        listOfCats.setListCat(Arrays.asList
                (new Cat("Плотон", 25), new Cat("Барскик", 15),(new Cat("Альфред", 2))));

//        System.out.println("--------Перебор итератором--------");
//        Iterator<Dog> iter = listDogs.iterator();
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//        }

        System.out.println("\n--------Сортировка через класс ComparableOfNameDog по имени--------");
        listDogs.getListDogs().sort(new ComparableOfNameDog());
        for (Dog dog: listDogs){
            System.out.println(dog);
        }
        System.out.println("\n--------Сортировка через класс ComparableOfNameDog по имени КОТЫ--------");
        listOfCats.getListCats().sort(new ComparableOfNameDog());
        for (Cat cat: listOfCats){
            System.out.println(cat);
        }
//        ListOfDogsIterator.setCount(0);
//
//        System.out.println("\n--------Сортировка через ссылку на метод по цвету--------");
//        listDogs.getListDogs().sort(Comparator.comparing(Dog::getColor));
//        listDogs.forEach(System.out::println);
//        ListOfDogsIterator.setCount(0);
//
//        System.out.println("\n--------Сортировка через анонимный класс по весу--------");
//        listDogs.getListDogs().sort(new Comparator<>() {
//            @Override
//            public int compare(Dog dog1, Dog dog2) {
//                return Integer.compare(dog1.getWeight(), dog2.getWeight());
//            }
//        });
//        listDogs.forEach(System.out::println);
    }
}
