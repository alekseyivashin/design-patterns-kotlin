import observer.Data
import observer.DataSubject
import observer.DisplayData
import strategy.Context
import strategy.StrategyMinus
import strategy.StrategyPlus

/**
 * Created on : 03.07.2017
 * Author     : aliv0816
 */

fun main(args: Array<String>) {
    testStrategy()
}

fun testObserver() {
    val subject = DataSubject()
    val displayLarge = DisplayData(subject, "Large")
    val displaySmall = DisplayData(subject, "Small")
    subject.newData(Data(24, "SPB"))
    subject.newData(Data(27, "KHV"))
    subject.newData(Data(4, "MSK"))
}

fun testStrategy() {
    val context = Context()

    context.strategy = StrategyPlus()
    println(context.executeStrategy(3, 5))

    context.strategy = StrategyMinus()
    println(context.executeStrategy(3, 5))
}