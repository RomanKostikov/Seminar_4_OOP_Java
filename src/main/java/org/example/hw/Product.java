package org.example.hw;

import java.math.BigDecimal;

/**
 * Абстрактный класс всех продуктов
 */
public abstract class Product {
    private String name;
    private BigDecimal price;

    /**
     * Конструктор по умолчанию, без параметров
     */
    public Product() {
    }

    /**
     * Конструктор с двумя аргументами
     *
     * @param name  Наименование продукта
     * @param price Цена продукта
     */
    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Получение наименования продукта
     *
     * @return наименование продукта
     */
    public String getName() {
        return name;
    }

    /**
     * Задание наименования продукта
     *
     * @param name наименование продукта
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получение цены продукта
     *
     * @return цена продукта
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Задание цены продукта с проверкой на корректность цены
     *
     * @param price цена продукта
     */
    public void setPrice(BigDecimal price) {
        if (price.compareTo(BigDecimal.valueOf(0)) > 0) this.price = price;
        else System.out.println("Стоимость не может быть равна или меньше нуля!");
    }

    /**
     * Получение содержимого экземпляра объекта в читаемом виде
     *
     * @return наименование продукта и его стоимость;
     */
    @Override
    public String toString() {
        return "\"" + name + "\" стоит: " + price + " у.е. ";
    }
}
