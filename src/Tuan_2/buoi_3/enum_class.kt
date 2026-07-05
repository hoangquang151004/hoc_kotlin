package Tuan_2.buoi_3

enum class TrangThaiDonHang{
    CHO_XAC_NHAN, DA_GIAO_HANG, HOAN_THANH, HUY
}

fun main() {
    val donHangHienTai = TrangThaiDonHang.DA_GIAO_HANG
    when (donHangHienTai) {
        TrangThaiDonHang.DA_GIAO_HANG -> { println("Don Hang da duoc gia")}
        TrangThaiDonHang.CHO_XAC_NHAN -> { println("Don hang dang cho duoc xac nhan")}
        TrangThaiDonHang.HOAN_THANH -> { println("Don hang da hoan thanh")}
        TrangThaiDonHang.HUY -> { println("Don hang da huy")}
    }
}