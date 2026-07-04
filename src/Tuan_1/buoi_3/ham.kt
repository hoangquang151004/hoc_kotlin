package Tuan_1.buoi_3
// Ham day du
fun tinhTong(a:Int , b: Int): Int{
    return a + b
}
// single expresion
fun tinhNhan(a:Int, b:Int): Int = a*b
// Ham tra ve voi
fun xinChao(ten: String){
    println("Xin chao: " + ten)
}
fun main(args: Array<String>) {

    println("tong cua 5 va 6 la: "+ tinhTong(5,6))
    println("Tich cua 7 va 8 la: "+ tinhNhan(7,8))
    xinChao("Quang")
}