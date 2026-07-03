package Buoi_5

data class SanPham (val id: Int, val ten: String, val gia: Double)

fun main() {

    val sp1 = SanPham(1,"Dien thoai", 15000.0)
    val sp2 = sp1.copy(gia = 14500.0)
    println(sp1)
}