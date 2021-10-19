package ru.shalkoff.solidexample.ocp.good.logger

import ru.shalkoff.solidexample.ocp.ProductOcp

/**
 * Интерфейс с методом логгирования, который каждый класс должен переопределить
 * и написать свою реализацию
 */
interface ProductLogger {

    fun log(productList: List<ProductOcp>)
}