package org.example.cw2;

import java.util.Iterator;
import java.util.List;

public class ListOfCats implements Iterable<Cat> {
    List<Cat> catList;
    private int countCat;

    public void setListCat(List<Cat> listCat) {
        this.catList = listCat;
    }
    public List<Cat> getListCats() {
        return catList;
    }

    @Override
    public Iterator<Cat> iterator() {
        return catList.iterator();
    }
}
