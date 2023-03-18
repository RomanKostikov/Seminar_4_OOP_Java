package org.example.cw1;

import java.util.List;

public class VetClinic<T> {
    private List<T> pets;

    public List<T> getAllPets() {
        return pets;
    }

    public void addPet(T pet) {
        pets.add(pet);
    }
}
