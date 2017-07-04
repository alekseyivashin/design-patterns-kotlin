package decorator


/**
 * Created on : 04.07.2017
 * Author     : aliv0816
 */

class Foam() : Component {
    override val component: Component?
        get() = null

    override fun add() {
        println("Foam")
    }
}