package Tuan_1.buoi_4
//Tạo một MutableList chứa tên 3 món ăn bạn thích.
//Thêm 1 món mới vào cuối danh sách.
//Xóa món ăn đầu tiên khỏi danh sách.
//Dùng vòng lặp forEach (hoặc for) để in ra từng món ăn kèm theo dòng chữ "Tôi muốn ăn...".
fun main(args: Array<String>) {
    var monAn = mutableListOf("Chuoi","Cam","Quyt")
    monAn.add("Sau rieng")
    println("Cac mon an toi thich: "+ monAn)
    monAn.remove("Chuoi")
    println("Cac mon an toi thich con lai khi an mon dau: "+ monAn)
    monAn.forEach{
        println(it + " Toi muon an ... ")
    }
}