class ColumnBlockContainer{
    val content: MutableList<Column> = mutableListOf()
    @ArcticleDSL
    inline fun column(block: ColumnBuilder.()-> Unit)=
        ColumnBuilder().apply(block).build().also{
            content.add(it)
        }
}
class RowBlockContainer{
    val content: MutableList<Row> = mutableListOf()
    @ArcticleDSL
    inline fun row(block: RowBuilder.()->Unit)=
        RowBuilder().apply(block).build().also{
            content.add(it)
        }
}
class CellBlockContainer{
    val content: MutableList<Cell> = mutableListOf()
    @ArcticleDSL
    inline fun cell(block: CellBuilder.()->Unit)=
        CellBuilder().apply(block).build().also{
            content.add(it)
        }
}