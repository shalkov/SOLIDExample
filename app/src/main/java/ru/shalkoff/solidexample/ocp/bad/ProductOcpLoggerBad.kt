package ru.shalkoff.solidexample.ocp.bad

import ru.shalkoff.solidexample.ocp.ProductOcp

/**
 * Класс в котором инкапсулирована логика логгирования данных связаных с продуктом.
 */
class ProductOcpLoggerBad {

    fun log(productList: List<ProductOcp>) {
        // если нам надо добавить логгирование например в БД, то нам надо будет менять этот класс
        // и тогда будет нарушаться прицип открытости/закрытости (OCP)
        logToConsole(productList)
    }

    private fun logToConsole(productList: List<ProductOcp>) {
        // Логика логгирования в консоль
    }

    private fun logToFile(productList: List<ProductOcp>) {
        // Логика логгирования в файл
    }
}