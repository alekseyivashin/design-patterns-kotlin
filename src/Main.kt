import observer.Data
import observer.DataSubject
import observer.DisplayData

/**
 * Created on : 03.07.2017
 * Author     : aliv0816
 */

fun main(args: Array<String>) {
    testObserver()
}

fun testObserver() {
    val subject = DataSubject()
    val displayLarge = DisplayData(subject, "Large")
    val displaySmall = DisplayData(subject, "Small")
    subject.newData(Data(24, "SPB"))
    subject.newData(Data(27, "KHV"))
    subject.newData(Data(4, "MSK"))
}