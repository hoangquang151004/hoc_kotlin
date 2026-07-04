package Tuan_1.buoi_4

var thuTu = listOf("Thu nhat", "thu hai", "thu ba")
fun main() {
    thuTu.forEachIndexed { index, xepHang ->
        println("Vi tri $index co xep hang la: "+ xepHang)
    }
}