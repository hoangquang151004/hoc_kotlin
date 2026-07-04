package Tuan_1.buoi_4

//Tạo một List chứa các số: 1, 1, 2, 3, 3, 4, 5, 5.
//Chuyển List này thành Set (Gợi ý: dùng hàm toSet()) để loại bỏ các số bị trùng lặp.
//In Set mới ra màn hình.
fun main() {
    var danhSachSo = listOf(1, 1, 2, 3, 3, 4, 5, 5)
    var danhSachMoi = danhSachSo.toSet()
    println("danh sach so sau khi loai bo la: "+ danhSachMoi)
}