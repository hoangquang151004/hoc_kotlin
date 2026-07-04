package Tuan_1.buoi_2

fun main(args: Array<String>) {
//    Khai báo một biến score (số nguyên) từ 0 đến 100.
//    Dùng cấu trúc when để in ra đánh giá tương ứng: 90-100 là "Xuất sắc", 70-89 là "Tốt", 50-69 là "Đạt", và dưới 50 là "Cần cố gắng".
    var score = 89
    when (score){
        in 90..100 -> println("Ban xuat xac vo cung")
        in 70 .. 89 -> println("Ban tot vo cung")
        in 50..69 -> println("Ban dat")
        in 0 .. 40 -> println("Ban phen qua")
        else -> println("Nhap qua ket qua roi")
    }
}