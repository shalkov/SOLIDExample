package ru.shalkoff.solidexample.ocp.bad

import ru.shalkoff.solidexample.ocp.ProductOcp

/**
 * Класс менеджер продукта, где нарушается принцип OCP
 *
 * Если мы заходим добавить логгирование в БД, то нам придёться менять класс
 */
class ProductOcpManagerBad(productList: List<ProductOcp>) {

    private val logger = ProductOcpLoggerBad()

    init {
        saveToStorage(productList)
    }

    private fun saveToStorage(productList: List<ProductOcp>) {
        //логика сохранения
        logger.log(productList)
    }
}