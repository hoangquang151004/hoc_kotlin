package Tuan_2.buoi_3

//Tạo một abstract class tên là ThuCung với thuộc tính ten (String) và tuoi (Int).
//Viết một hàm abstract fun keu() và một hàm thường fun an() { println("$ten đang ăn hạt...") } bên trong lớp cha.
//Tạo class Cho kế thừa ThuCung, có thêm thuộc tính giongCho (String). Override hàm keu() để in ra: "[Tên] sủa gâu gâu!".
//Tạo class Meo kế thừa ThuCung, có thêm thuộc tính mauLong (String). Override hàm keu() để in ra: "[Tên] kêu meo meo!".
//Trong hàm main(), tạo một List<ThuCung> gồm cả chó và mèo.
//Dùng vòng lặp duyệt qua danh sách, gọi lần lượt hàm keu() và an() cho từng con.

abstract class ThuCung(var ten:String, var tuoi: Int){
    abstract fun keu()
    fun an(){
        println("$ten dang an hat ...")
    }
}
class Cho(ten: String, tuoi: Int, giongCho: String):ThuCung(ten,tuoi){
    override fun keu() {
        println("$ten sua gau gau ...")
    }
}
class Meo(ten: String, tuoi:Int, mauLong: String):ThuCung(ten,tuoi){
    override fun keu() {
        println("$ten keu meo meo ...")
    }
}

fun main() {
    var danhSachThuCung = mutableListOf<ThuCung>()
    danhSachThuCung.add(Meo("tom",2,"Xanh"))
    danhSachThuCung.add(Cho("cat",1,"cho co"))
    danhSachThuCung.add(Cho("dog",1,"pit bun"))

    danhSachThuCung.forEach {
        it.keu()
        it.an()
    }
}