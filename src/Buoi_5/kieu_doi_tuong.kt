package Buoi_5

object DatabaseManager{
    fun ketNoi(kiemTraKetNoi: Boolean){
        if (kiemTraKetNoi){
            println("Ket noi thang cong")
        }else println("Ket noi ko thang cong!!!")
    }
}

fun main() {
    DatabaseManager.ketNoi(true)
}