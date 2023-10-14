@ArcticleDSL
fun table(x: TableBuilder.()-> Unit):Table = TableBuilder().apply(x).build()