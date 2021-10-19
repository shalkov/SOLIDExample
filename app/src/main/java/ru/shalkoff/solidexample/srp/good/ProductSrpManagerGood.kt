package ru.shalkoff.solidexample.srp.good

import ru.shalkoff.solidexample.srp.ProductSrp

/**
 * Класс менеджер продукта, где не нарушается принцип SRP.
 *
 * Логика логгирования инкапсулирована в отдельный класс.
 */
class ProductSrpManagerGood(productList: List<ProductSrp>) {

    private val logger: ProductSrpLogger = ProductSrpLogger()

    init {
        saveToStorage(productList)
    }

    private fun saveToStorage(productList: List<ProductSrp>) {
        //логика сохранения
        logger.log(productList)
    }
}