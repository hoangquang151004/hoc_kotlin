package buoi_4

var thongTinSV = mapOf("Quang" to 9,"Lan" to 9.5, "Hoang" to 7.5)

fun main(args: Array<String>) {
    thongTinSV.forEach {
        (ten, diem) ->
        println("diem cua $ten dat diem la: $diem")}
}