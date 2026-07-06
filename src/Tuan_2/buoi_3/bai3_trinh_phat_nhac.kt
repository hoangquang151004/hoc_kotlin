package Tuan_2.buoi_3
//Tạo một Singleton object tên là ThietLapNhac lưu biến amLuong (Int, mặc định 50). Viết custom setter để đảm bảo âm lượng luôn nằm trong khoảng 0 đến 100.
//Tạo một sealed class tên là TrangThaiPhat.
//Khai báo các trạng thái bên trong TrangThaiPhat:
//object DangDung (Không mang dữ liệu).
//object DangTai (Không mang dữ liệu).
//data class DangPhat(val tenBaiHat: String, val thoiLuong: Int) (Mang theo thông tin bài hát).
//data class Loi(val maLoi: String) (Mang theo câu báo lỗi).
//Viết một hàm hienThiGiaoDien(trangThai: TrangThaiPhat) dùng cấu trúc when để xử lý và in ra màn hình tương ứng với từng trạng thái.
//Trong hàm main(), thử thay đổi âm lượng qua ThietLapNhac.amLuong = 120 (để test giới hạn setter). Sau đó truyền lần lượt các trạng thái khác nhau vào hàm hienThiGiaoDien.
object ThietLapNhac{
    var amLuong: Int = 50
        set(value){
            if (value in 0..100){
                field = value
            }
            else println("Loi am luong: am luong chi duoc nam trong khoang tu 0 den 100")
        }
        get(){
        return field
    }

}
sealed class TrangThaiPhat{
    object DangDung: TrangThaiPhat()
    object DangTai: TrangThaiPhat()
    data class DangPhat(val tenBaiHat:String, val thoiLuong:Int): TrangThaiPhat()
    data class Loi(val maLoi:String): TrangThaiPhat()
}
fun hienThiGiaoDien(trangThai: TrangThaiPhat){
    when(trangThai){
        is TrangThaiPhat.DangDung -> println("Bai Hat dang dung")
        is TrangThaiPhat.DangTai -> println("Bai Hat dang tai")
        is TrangThaiPhat.DangPhat -> {println("Bai Hat dang phat la: ${trangThai.tenBaiHat} ,Thoi luong la: ${trangThai.thoiLuong}")}
        is TrangThaiPhat.Loi -> {println("Bai Hat loi: ${trangThai.maLoi}")}
    }
}
fun main() {
    println("Am luong ban dau: ${ThietLapNhac.amLuong}")
    ThietLapNhac.amLuong = 120
    ThietLapNhac.amLuong = 30
    println("Am luong hien tai: ${ThietLapNhac.amLuong}")
    println("-------------------------")
    hienThiGiaoDien(TrangThaiPhat.DangDung)
    hienThiGiaoDien(TrangThaiPhat.DangTai)
    hienThiGiaoDien(TrangThaiPhat.DangPhat("Chay ngay di",30))
    hienThiGiaoDien(TrangThaiPhat.Loi("Bai hat qua hay nen loi hehe"))

}