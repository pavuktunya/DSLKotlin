import kotlin.reflect.KClass
@ArcticleDSL
class TableBuilder {
    var columnBlocks: MutableList<Column> = mutableListOf()
    var rowBlocks: MutableList<Row> = mutableListOf()
    fun column(block: ColumnBlockContainer.() -> Unit){
        val columnBlockContainer = ColumnBlockContainer().apply(block)
        columnBlocks.addAll(columnBlockContainer.content)
    }
    fun row(block: RowBlockContainer.() -> Unit){
        val rowBlockContainer = RowBlockContainer().apply(block)
        rowBlocks.addAll(rowBlockContainer.content)
    }
    fun build()=Table(columnBlocks, rowBlocks)
}