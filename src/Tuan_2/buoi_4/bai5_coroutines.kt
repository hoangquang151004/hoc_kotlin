package Tuan_2.buoi_4
import kotlinx.coroutines.*

suspend fun taiDuLieuTuMang(): String{
    println("Dang ket noi den server ... ")
    delay(1000)
    return "Du lieu phim anh tu 2025"
}
fun main(){
    println("1. nguoi dung mo app len")
    // khoi tao moi truong chay runBlocking
    runBlocking {
        launch {
            println("2. [Coroutine chay ngam] Bat dau di lay du lieu")

            // goi suspend funtion
            val ketqua = taiDuLieuTuMang()

            println("4. [Coroutine chay ngam] lay xong roi! ket qua la: ${ketqua}")
        }
        println("3. [Luong chinh] app van muot, nguoi dung van luot duoc menu")
    }
}
