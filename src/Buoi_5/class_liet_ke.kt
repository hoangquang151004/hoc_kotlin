package Buoi_5

enum class TrangThaiDonHang{
    DANG_XU_LY, DA_GIAO, DA_HUY
}

fun main() {
    val trangThai = TrangThaiDonHang.DA_GIAO
    if (trangThai == TrangThaiDonHang.DA_GIAO) {
        println("Don hang da duoc giao den khach")
    }
}