// Cau lenh dieu kien if else
package buoi_2

fun main(args: Array<String>) {
    var age = 22
    if (age >= 18) {
        println("du tuoi truong thanh")
    }else{
        println("Chua du tuoi")
    }
    // toan tu 3 ngoi
    var a = 20
    var b = 30
    var max = if (a > b) a else b
    println("Gia tri lon nhat la: "+max)
}