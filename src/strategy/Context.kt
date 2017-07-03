package strategy


/**
 * Created on : 03.07.2017
 * Author     : aliv0816
 */

class Context {
    var strategy: Strategy? = null

    fun executeStrategy(a: Int, b: Int) = strategy?.execute(a, b)
}