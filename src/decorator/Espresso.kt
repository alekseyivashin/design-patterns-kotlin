package decorator


/**
 * Created on : 04.07.2017
 * Author     : aliv0816
 */

class Espresso(override val component: Component) : Component {
    override fun add() {
        println("Espresso")
        component.add()
    }
}