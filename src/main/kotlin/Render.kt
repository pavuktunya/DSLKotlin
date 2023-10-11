interface Rendering{
    fun render(message: String)
}
class Render(val name:String, private val rend:Rendering=InstantRender(name)):Rendering by rend
class InstantRender(val programName:String):Rendering{
    init{
        println("Table rendering by RENDER#${(programName).uppercase()}")
    }
    override fun render(message: String){
        println(message)
    }
}
fun Render(table: Table, r: Render){
    table.row.forEach {
        it.row.forEach{r.render(it.content)}
        println("ROW")
    }
}
fun Table.render():Table{
    Render(this, Render("TOPCHIK"))
    return this
}