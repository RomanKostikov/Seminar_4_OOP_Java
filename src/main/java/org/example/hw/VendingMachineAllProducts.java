package org.example.hw;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Работа торгового автомата, загрузка, поиск
 *
 * @param <T> все классы потомки класса Product
 */
public class VendingMachineAllProducts<T extends Product> implements VendingMachine {
    private List<T> product;
    private final List<T> resultFind = new ArrayList<>();

    /**
     * метод загрузки торгового автомата
     *
     * @param product лист продуктов
     */
    public void initProduct(List<T> product) {
        this.product = product;
    }

    /**
     * Поиск продукта по имени
     *
     * @param name наименование продукта
     * @return найденный результат или "Не найдено"
     */
    public String getProduct(String name) {
        for (T product : product) {
            if (product.getName().equals(name)) return product.toString();
        }
        return "Не найдено!";
    }

    /**
     * Поиск продуктов по цене меньше или равной заданной
     *
     * @param price максимально допустимая цена
     * @return продукты равные или дешевле заданной стоимости или "Не найдено!"
     */
    public String getProduct(BigDecimal price) {
        resultFind.clear();
        for (T el : product) {
            if (el.getPrice().compareTo(price) <= 0) resultFind.add(el);
        }
        return resultFind.isEmpty() ? "Не найдено!" : resultFind.toString();
    }

    /**
     * Поиск продуктов по температуре меньше или равной заданной с проверкой отношения к классу HotDrinks
     *
     * @param temp максимально допустимая температура
     * @return продукты равные или дешевле заданной температуры или "Не найдено!"
     */
    public String getProduct(int temp) {
        resultFind.clear();
        for (T el : product) {
            if (el instanceof HotDrinks && ((HotDrinks) el).getTemp() <= temp) resultFind.add(el);
        }

        return resultFind.isEmpty() ? "Не найдено!" : resultFind.toString();
    }

    /**
     * Переопределенный метод интерфейса VendingMachine
     */
    @Override
    public void initProduct() {
    }

    /**
     * Переопределенный метод интерфейса VendingMachine
     *
     * @return
     */
    @Override
    public String getProduct() {
        return null;
    }
}
