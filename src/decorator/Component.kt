package decorator


/**
 * Created on : 04.07.2017
 * Author     : aliv0816
 */

interface Component {
    val component: Component?
    fun add()
}