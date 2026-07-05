package Tuan_2.buoi_3
// giong static class
object DatabaseManager {
    var tenDatabase = "Quan ly ban Hang"
    fun ketNoi(){
        println("Da ket noi toi databae: "+ tenDatabase)
    }
}

fun main() {
    DatabaseManager.ketNoi()
}