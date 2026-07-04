package Tuan_2.buoi_2

class TaiKhoanNganHang(val chuTaiKhoan:String){
    private var soDu: Double = 0.0
//    val xemSoDu: Double
//    get() = soDu
    fun napTien(soTien:Double){
        if (soTien > 0){
            soDu += soTien
            println("Nap tien thanh cong ${soTien}, so du hien tai la: ${soDu} ")
        } else
            println("So tien nap khong hop le!")
    }
}

fun main() {
    var taiKhoanA = TaiKhoanNganHang("A")
    taiKhoanA.napTien(10.0)
}