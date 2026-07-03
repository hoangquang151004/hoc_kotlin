package Buoi_5

//Tạo một enum class tên là ChucVu với 3 giá trị: GIAM_DOC, QUAN_LY, NHAN_VIEN.
//Tạo một class thường tên là NhanSu gồm: ten (String) và chucVu (Kiểu Enum ChucVu).
//Dùng cấu trúc when để kiểm tra: Nếu là GIAM_DOC in ra "Được truy cập phòng VIP", ngược lại in ra "Chỉ truy cập phòng làm việc chung".

enum class ChucVu{
    GIAM_DOC,
    QUAN_LY,
    NHAN_VIEN
}
class NhanSu(val ten: String, var chucVu: ChucVu) {}

fun main() {
    var ns1 = NhanSu("Quang Hoang Van", ChucVu.GIAM_DOC)
    when (ns1.chucVu) {
       ChucVu.NHAN_VIEN -> {println("Duoc vao phong vip")}
        else -> {println("Chi truy cap phong lam viec chung")}
    }
}