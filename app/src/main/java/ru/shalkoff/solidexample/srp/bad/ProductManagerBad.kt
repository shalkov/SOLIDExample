package ru.shalkoff.solidexample.srp.bad

import ru.shalkoff.solidexample.srp.Product

/**
 * Класс менеджер продукта, где нарушается принцип SRP
 *
 * В классе, где предусмотрена логика связанная с продуктом,
 * присутствует логика логгирования в консоль.
 */
class ProductManagerBad(productList: List<Product>) {

    init {
        saveToStorage(productList)
    }

    private fun saveToStorage(productList: List<Product>) {
        //логика сохранения
        logToConsole(productList)
    }

    private fun logToConsole(productList: List<Product>) {
        //логика логгирования в консоль
    }
}