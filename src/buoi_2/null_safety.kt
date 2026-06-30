package buoi_2

fun main(args: Array<String>) {
    // cho phep kieu du lieu duoc phep rong (null)
    var a: String? = null
    // gan bien mac dinh neu b rong
    val b = a?.length ?: "rong"
    // dung !! khi chac chan bien do khong rong
    var name = "Hoang Quang Van"
    val length_name = name!!.length
}