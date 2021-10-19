package ru.shalkoff.solidexample.srp.bad

import ru.shalkoff.solidexample.srp.ProductSrp

/**
 * Класс менеджер продукта, где нарушается принцип SRP
 *
 * В классе, где предусмотрена логика связанная с продуктом,
 * присутствует логика логгирования в консоль.
 */
class ProductSrpManagerBad(productList: List<ProductSrp>) {

    init {
        saveToStorage(productList)
    }

    private fun saveToStorage(productList: List<ProductSrp>) {
        //логика сохранения
        logToConsole(productList)
    }

    private fun logToConsole(productList: List<ProductSrp>) {
        //логика логгирования в консоль
    }
}