package ru.shalkoff.solidexample.srp.good

import ru.shalkoff.solidexample.srp.Product

/**
 * Класс в котором инкапсулирована логика логгирования данных связаных с продуктом.
 */
class ProductLogger {

    fun log(productList: List<Product>) {
        // можем легко(в одном месте) заменить способ логгирования,
        // и не нужно будет менять в других местах.
        logToConsole(productList)
    }

    private fun logToConsole(productList: List<Product>) {
        // Логика логгирования в консоль
    }

    private fun logToFile(productList: List<Product>) {
        // Логика логгирования в файл
    }
}