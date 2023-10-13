fun table(block: TableBuilder.()-> Unit):Table = TableBuilder().apply(block).build()
fun column(block: ColumnBuilder.()-> Unit): Column = ColumnBuilder().apply(block).build()
fun row(block: RowBuilder.()-> Unit):Row = RowBuilder().apply(block).build()
fun cell(block: CellBuilder.()-> Unit):Cell=CellBuilder().apply(block).build()
