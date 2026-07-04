package Tuan_1.buoi_3

var lam_viec = {tienLuong: Int -> println("Toi lam viec cham chi nhung ma luong thi: $tienLuong")}
var luong_thang = {so_tien:Int, tien_an:Int, tien_o:Int -> so_tien - (tien_an + tien_o)}
fun main() {
    lam_viec(luong_thang(3000000,2000000,950000))
}