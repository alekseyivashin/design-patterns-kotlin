package observer


/**
 * Created on : 03.07.2017
 * Author     : aliv0816
 */

class DataSubject: Subject {
    override var observers: MutableList<Observer> = mutableListOf<Observer>()
    var data: Data? = null

    fun newData(data: Data) {
        this.data = data
        notifyObservers()
    }

    override fun notifyObservers() {
        observers.forEach { it.update(data) }
    }
}