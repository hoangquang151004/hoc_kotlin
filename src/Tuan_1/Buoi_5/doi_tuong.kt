package Tuan_1.Buoi_5

class SinhVien(var ten:String, var tuoi: Int){
    fun gioiThieu(){
        println("minh ten la ${this.ten}, minh co tuoi la ${tuoi}")
    }
}

fun main(args: Array<String>) {
    val sv1 = SinhVien("Quang", 23)
    sv1.gioiThieu()
}