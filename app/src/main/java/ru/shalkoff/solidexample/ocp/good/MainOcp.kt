package ru.shalkoff.solidexample.ocp.good

import ru.shalkoff.solidexample.ocp.good.ProductOcpManagerGood
import ru.shalkoff.solidexample.ocp.good.logger.ProductLogger
import ru.shalkoff.solidexample.ocp.good.logger.ProductOcpDatabaseLogger
import ru.shalkoff.solidexample.ocp.good.logger.ProductOcpFileLogger

/**
 * Класс эмулятор метода main
 */
class MainOcp {

    init {
        // тут мы с прдерживаемся полиморфизма: "один интерфейс, множество реализаций"
        val loggerFile: ProductLogger = ProductOcpFileLogger()
        val loggerDatabase: ProductLogger = ProductOcpDatabaseLogger()

        //можем создавать разные экземпляры менеджера продукта
        // и передовать туда различную логику логгирования
        val managerFirst = ProductOcpManagerGood(listOf(), loggerFile)
        val managerSecond = ProductOcpManagerGood(listOf(), loggerDatabase)
    }
}