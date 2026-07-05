package Tuan_1.buoi_4

//Tạo một danh sách (List) chứa điểm số của 6 sinh viên: 4, 9, 6, 3, 8, 10.
//Dùng hàm filter để tạo một danh sách mới chỉ chứa các điểm số Đỗ (Lớn hơn hoặc bằng 5).
//Dùng hàm sortedByDescending (sắp xếp giảm dần) để sắp xếp danh sách điểm Đỗ ở trên từ cao xuống thấp.
//In danh sách kết quả ra màn hình.
fun main() {
    var diemSoSinhVien = listOf(4, 9, 6, 3, 8, 10)
    var danhSachDiemDo = diemSoSinhVien.filter { it >= 5 } // trả ve boolean
    println("Danh sach diem do la: $danhSachDiemDo")
    danhSachDiemDo = danhSachDiemDo.sortedByDescending { it }
    println("Danh sach diem do co sap xep la: $danhSachDiemDo")
}