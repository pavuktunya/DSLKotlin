import kotlin.math.max
interface Rendering{
    fun render(message: String)
}
fun Table.render():Table=this.apply{Render(Render("TOPCHIK"))}
class Render(val name:String, val rend:Rendering=InstantRender(name))
    :Rendering by rend
class InstantRender(val programName:String):Rendering{
    init{
        println("Table rendering by RENDER#${(programName).uppercase()}")
    }
    override fun render(message: String){
        println(message)
    }
}
////////////////////SO MUCH CODE////////////////////
fun Table.Render(r: Render){
    val table=this
    val valuesMaxLen = mutableMapOf<String, Int>()
    for (cols in table.column) {
        valuesMaxLen[cols.title ?: ""] = max(valuesMaxLen[cols.title] ?: 0, cols.title!!.length)
    }
    for (row in table.row) {
        for (cell in row.cell) {
            valuesMaxLen[cell.title] = max(cell.content.toString().length, valuesMaxLen[cell.title] ?: 0)
        }
    }

    val header = buildString {
        append("+")
        valuesMaxLen.forEach {
            append("-".repeat(it.value + 2))
            append("+")
        }
        append("\n")
        append("|")
        table.column.forEach { column ->
            append(" ${column.title!!.padEnd(valuesMaxLen[column.title] ?: 0)} |")
        }
        append("\n")
        append("+")
        valuesMaxLen.forEach {
            append("-".repeat(it.value + 2))
            append("+")
        }
    }
    val dataRows = buildString {
        table.row.forEach { row ->
            append("|")
            row.cell.forEach { cell ->
                append(" ${cell.content.padEnd(valuesMaxLen[cell.title] ?: 0)} |")
            }
            append("\n")
        }
        append("+")
        valuesMaxLen.forEach {
            append("-".repeat(it.value + 2))
            append("+")
        }
    }
    r.render(header)
    r.render(dataRows)
}