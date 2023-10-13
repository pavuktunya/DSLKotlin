@ArcticleDSL
class RowBuilder{
    var row: MutableList<Cell> = mutableListOf()
    fun cell(block: CellBlockContainer.() -> Unit){
        val cellBlockContainer = CellBlockContainer().apply(block)
        row.addAll(cellBlockContainer.content)
    }
    fun build()=Row(row)
}
