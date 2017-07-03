package strategy


/**
 * Created on : 03.07.2017
 * Author     : aliv0816
 */

class StrategyMinus : Strategy {
    override fun execute(a: Int, b: Int): Int {
        println("StrategyMinus was called")
        return a - b
    }
}