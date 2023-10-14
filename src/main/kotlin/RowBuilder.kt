@ArcticleDSL
class RowBuilder{
    var cells: MutableList<Cell> = mutableListOf()
    @ArcticleDSL
    inline fun toCell(block: CellBuilder.() -> Unit){
        val cellBuilder = CellBuilder().apply(block).build()
        cells.add(cellBuilder)
    }
    fun build()=Row(cells)
}
