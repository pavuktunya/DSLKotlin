import kotlin.reflect.KClass

class TableGenerator {
    fun generateTable():Table=table{

        column("ID", "Int::class")
        column("Name", "String::class")
        column("Age", "Int::class")

        row {
            cell("ID", "1")
            cell("Name", "Alice")
            cell("Age", "25")
        }
        row {
            cell("ID", "2")
            cell("Name", "Bob")
            cell("Age", "30")
        }
    }.render()
}
fun column(_title: String, _type: String)=column{
    title=_title
    type=_type
}
fun cell(_title: String, _content: String)=cell{
    title=_title
    content=_content
}
