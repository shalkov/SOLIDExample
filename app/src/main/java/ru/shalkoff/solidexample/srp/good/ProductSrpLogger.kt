package ru.shalkoff.solidexample.srp.good

import ru.shalkoff.solidexample.srp.ProductSrp

/**
 * Класс в котором инкапсулирована логика логгирования данных связаных с продуктом.
 */
class ProductSrpLogger {

    fun log(productList: List<ProductSrp>) {
        // можем легко(в одном месте) заменить способ логгирования,
        // и не нужно будет менять в других местах. НО, это не идеальный вариант,
        // тут нарушается прицип открытости/закрытости (OCP),
        // если нам надо будет добавить ещё способы логгирования
        logToConsole(productList)
    }

    private fun logToConsole(productList: List<ProductSrp>) {
        // Логика логгирования в консоль
    }

    private fun logToFile(productList: List<ProductSrp>) {
        // Логика логгирования в файл
    }
}