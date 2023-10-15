import kotlin.reflect.KClass
@ArcticleDSL
class ColumnBuilder{
    var type: KClass<*> = String::class
    var title: String=""
    fun build()=Column(title, type)
}