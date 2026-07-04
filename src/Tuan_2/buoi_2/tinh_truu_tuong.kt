package Tuan_2.buoi_2

interface HinhHoc{
    fun tinhDienTich(): Double
}
class HinhTron(val banKinh: Double):HinhHoc{
    override fun tinhDienTich():Double{
        return banKinh*banKinh*3.14
    }
}
class HinhVuong(val canh: Double):HinhHoc{
    override fun tinhDienTich():Double{
        return canh*canh
    }
}