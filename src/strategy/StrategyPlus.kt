package strategy


/**
 * Created on : 03.07.2017
 * Author     : aliv0816
 */

class StrategyPlus : Strategy {
    override fun execute(a: Int, b: Int): Int {
        println("StrategyPlus was called")
        return a + b
    }
}