class ColumnBlockContainer{
    val content: MutableList<Column> = mutableListOf()
    fun addColumn(block: ColumnBuilder.()-> Unit)=
        ColumnBuilder().apply(block).build().also{
            content.add(it)
        }
}
class RowBlockContainer{
    val content: MutableList<Cell> = mutableListOf()
    inline fun toCell(block: CellBuilder.()->Unit):Cell=
        CellBuilder().apply(block).build().also{
            content.add(it)
        }
}