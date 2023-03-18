package org.example.hw;

/**
 * Интерфейс торгового автомата
 */
public interface VendingMachine {
    /**
     * Внесение продуктов в торговый автомат
     */
    void initProduct();

    /**
     * Получение продукта из торгового автомата
     *
     * @return строку
     */
    String getProduct();
}
