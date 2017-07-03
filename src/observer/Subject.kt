package observer


/**
 * Created on : 03.07.2017
 * Author     : aliv0816
 */

interface Subject {

    var observers: MutableList<Observer>

    fun attach(o: Observer) = observers.add(o)

    fun detach(o: Observer) = observers.remove(o)

    fun notifyObservers()
}