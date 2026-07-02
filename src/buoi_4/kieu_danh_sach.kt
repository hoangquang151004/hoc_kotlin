package buoi_4

val danhSachTraiCay = listOf("Tao", "Cam", "chuoi")
var gioHang = mutableListOf("Ao thun","Quan Au","Mu luoi chai")

fun main(args: Array<String>) {
    gioHang.add("Gay bong Chay")
    println(gioHang)
    gioHang.removeAt(0)
    println(gioHang)
}