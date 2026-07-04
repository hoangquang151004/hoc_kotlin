package Tuan_1.buoi_2

// vong lap dieu kien when
fun main(args: Array<String>) {
    val day = 3
    when(day){
        1 -> println("Chu nhat")
        2 -> println("Thu hai")
        3,4,5 -> println("Giua tuan")
        6,7 -> println("Cuoi tuan roi")
        else -> println("Loi khong hop le")
    }
    var score = 80
    var grade = when(score){
        in 80..90 -> "Tot"
        in 91..100 -> "Xuat xac"
        else -> "Can co gang"
    }
    println("Tinh trang hoc luc cua ban: "+grade)

}
