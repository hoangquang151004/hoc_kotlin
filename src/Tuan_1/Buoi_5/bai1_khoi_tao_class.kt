package Tuan_1.Buoi_5

//Tạo một data class tên là Sach gồm các thuộc tính: maSach (Int), tenSach (String), tacGia (String).
//Khởi tạo 2 cuốn sách khác nhau trong hàm main().
//In thông tin 2 cuốn sách ra màn hình.
//Tạo cuốn sách thứ 3 bằng cách dùng hàm .copy() từ cuốn sách số 1 và thay đổi tên tác giả.

data class Sach(val maSach: Int, val tenSach: String, val tacGia: String)

fun main(args: Array<String>) {
    var sach1 = Sach(12, "Co chan Nhan", "Co nguyet chan nhan")
    var sach2 = Sach(123, "dao quy di tien", "Phat tien hien hoa")
    println("Thong tin sach 1 la: ma sach: ${sach1.maSach} , Ten sach: ${sach1.tenSach}, Tac gia la: ${sach1.tacGia}")
    println("Thong tin sach 2 la: ma sach: ${sach2.maSach} , Ten sach: ${sach2.tenSach}, Tac gia la: ${sach2.tacGia}")
    var sach3 = sach1.copy(tacGia = "Bi bat roi")
    println("Thong tin sach 3 la: ma sach: ${sach3.maSach} , Ten sach: ${sach3.tenSach}, Tac gia la: ${sach3.tacGia}")

}