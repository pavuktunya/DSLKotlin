@ArcticleDSL
class TableBuilder {
    var columnBlocks: MutableList<Column> = mutableListOf()
    var rowBlocks: MutableList<Row> = mutableListOf()
    @ArcticleDSL
    inline fun toColumn(block: ColumnBuilder.() -> Unit){
        val columnBuilder = ColumnBuilder().apply(block).build()
        columnBlocks.add(columnBuilder)
    }
    @ArcticleDSL
    inline fun row(block: RowBuilder.() -> Unit){
        val rowBuilder = RowBuilder().apply(block).build()
        rowBlocks.add(rowBuilder)
    }
    fun build():Table{
        return Table(columnBlocks, rowBlocks)
    }
}