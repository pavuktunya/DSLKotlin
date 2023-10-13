import kotlin.reflect.KClass
data class Table (val column: List<Column>, val row: List<Row>)
data class Column(val title: String, val type: KClass<*>)
data class Row(val cell: List<Cell>)
data class Cell(val title: String, val content: String)