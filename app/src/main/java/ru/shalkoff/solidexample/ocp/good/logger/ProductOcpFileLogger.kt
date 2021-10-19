package ru.shalkoff.solidexample.ocp.good.logger

import ru.shalkoff.solidexample.ocp.ProductOcp

/**
 * Класс логгирования в файл, который не нарушает принцим открытости/закрытости.
 *
 * Класс самодостаточен и его врядли придётся менять,
 * он всегда будет выполнять то, что должен - логгировать в файл
 */
class ProductOcpFileLogger : ProductLogger {

    override fun log(productList: List<ProductOcp>) {
        //логгирование в файл
    }
}