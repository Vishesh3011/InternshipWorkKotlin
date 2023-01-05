import java.util.UUID

//interface IdProvider {
//    fun getId(): String
//}
//
//class Entity private constructor(val id : String){
//    companion object Factory : IdProvider {
//        override fun getId(): String {
//            return "123"
//        }
//        const val id = "id"
//
//        fun create() = Entity("id")
//    }
//}
//
//fun main() {
//    val entity = Entity.Factory.create()
//    Entity.id
//}

//object declarations

enum class EntityType {
    HELP, EASY, MEDIUM, HARD;

    fun getFormattedName() = name.toLowerCase().capitalize()
}

object EntityFactory {
//    fun create() = Entity("id", "name")
    fun create(type: EntityType) : Entity{
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> "Hard"
            EntityType.HELP -> type.getFormattedName()
        }
//        return Entity(id, name)
        return when(type) {
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, 2f)
            EntityType.HELP -> Entity.Help
        }
    }
}

//class Entity(val id: String, val name: String) {
//    override fun toString(): String {
//        return "id: $id, name: $name"
//    }
//}

sealed class Entity() {
    object Help: Entity() {
        val name = "Help"
    }

    data class Easy(val id: String, val name: String): Entity()
    data class Medium(val id: String, val name: String): Entity()
    data class Hard(val id: String, val name: String, val multiplier: Float): Entity()

}

fun main() {
    val entity: Entity = EntityFactory.create(EntityType.HELP)
    val msg = when (entity){
        is Entity.Easy -> "easy class"
        is Entity.Hard -> "hard class"
        Entity.Help -> "help class"
        is Entity.Medium -> "medium class"
    }
    println(msg)

//    println(entity)
//
//    val mediumEntity = EntityFactory.create(EntityType.MEDIUM)
//    println(mediumEntity)
}
