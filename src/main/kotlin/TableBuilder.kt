import kotlin.reflect.KClass
@ArcticleDSL
class TableBuilder {
    var column: MutableList<Column> = mutableListOf()
    var row: MutableList<Row> = mutableListOf()
    fun columnBlocks(block: ColumnBlockContainer.() -> Unit){
        val columnBlockContainer = ColumnBlockContainer().apply(block)
        column.addAll(columnBlockContainer.content)
    }
    fun rowBlocks(block: RowBlockContainer.() -> Unit){
        val rowBlockContainer = RowBlockContainer().apply(block)
        row.addAll(rowBlockContainer.content)
    }
    fun build()=Table(column, row)
}