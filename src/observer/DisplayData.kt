package observer


/**
 * Created on : 03.07.2017
 * Author     : aliv0816
 */

class DisplayData(override val subject: Subject, val name: String): Observer {

    init {
        subject.attach(this)
    }

    var data: Data? = null

    override fun update(data: Data?) {
        this.data = data
        display()
    }

    override fun display() {
        println("$name, $data")
    }
}