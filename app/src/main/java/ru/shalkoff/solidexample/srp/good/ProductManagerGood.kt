package ru.shalkoff.solidexample.srp.good

import ru.shalkoff.solidexample.srp.Product

/**
 * Класс менеджер продукта, где не нарушается принцип SRP.
 *
 * Логика логгирования инкапсулирована в отдельный класс.
 */
class ProductManagerGood(productList: List<Product>) {

    private val logger = ProductLogger()

    init {
        saveToStorage(productList)
    }

    private fun saveToStorage(productList: List<Product>) {
        //логика сохранения
        logger.log(productList)
    }
}