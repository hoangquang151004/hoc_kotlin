package Tuan_2.buoi_3
// la class nhung chi co thuoc tinh
data class NguoiDung(val id:Int, var ten:String, val email:String)

fun main() {
    val user1 = NguoiDung(1,"jack","jackfivemilion@gmail.com")
    val user2 = NguoiDung(1,"jack","jackfivemilion@gmail.com")
    println(user1)
    println(user1 == user2)
    val user3 = user1.copy(email ="quang@gmail.com")
    println(user3)

}