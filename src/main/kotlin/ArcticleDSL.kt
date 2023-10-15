@ArcticleDSL
fun table(block: TableBuilder.()-> Unit):Table = TableBuilder().apply(block).build()