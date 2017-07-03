package observer


/**
 * Created on : 03.07.2017
 * Author     : aliv0816
 */

interface Observer {

    val subject: Subject

    fun update(data: Data?)

    fun display()
}