class CleverAgent(override val name: String): Actor {
    var animalSensed:Percept? = null

    override fun act(): Action {
        TODO("Not yet implemented")
    }

    override fun perceive(vararg facts: Percept) {

    }
}