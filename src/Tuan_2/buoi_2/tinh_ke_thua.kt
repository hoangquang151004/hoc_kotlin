package Tuan_2.buoi_2

open class NhanVien(val ten:String, val luongCoban: Double){
    open fun tinhLuong(): Double{
        return luongCoban
    }
    fun thongTinBiMat(){
        println("day la thong tin bi mat")
    }
}
class QuanLy (ten:String, luongCoban:Double, val tienLuong: Double):NhanVien(ten, luongCoban){
    override fun tinhLuong(): Double{
        return super.tinhLuong() + tienLuong
    }
}

fun main() {
    var quanly = QuanLy("quang",12.3,22.1)
    var tongLuong = quanly.tinhLuong()
    println("tien luong cua quan ly la: "+tongLuong)
    quanly.thongTinBiMat()
}