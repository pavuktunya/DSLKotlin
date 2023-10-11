import kotlin.reflect.KClass

@ArcticleDSL
class ColumnBuilder{
    var title: String=""
    var type: String = "String::class"
    fun build()=Column(title, type)
}