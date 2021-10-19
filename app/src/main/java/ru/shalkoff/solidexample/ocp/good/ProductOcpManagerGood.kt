package ru.shalkoff.solidexample.ocp.good

import ru.shalkoff.solidexample.ocp.ProductOcp
import ru.shalkoff.solidexample.ocp.good.logger.ProductLogger

/**
 * Класс менеджер продукта, где не нарушается принцип OCP.
 *
 * Логгика логгирования передаётся в конструкторе.
 * Мы знаем только тип интерфейса, но не конкретную реализацию.
 */
class ProductOcpManagerGood(
    productList: List<ProductOcp>,
    private val logger: ProductLogger
) {

    init {
        saveToStorage(productList)
    }

    private fun saveToStorage(productList: List<ProductOcp>) {
        //логика сохранения
        logger.log(productList)
    }
}