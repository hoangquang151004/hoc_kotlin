package Tuan_3
// let de kiem tra null
var tenNguoiDung :String? = null
// apply de tra ve trang thai ban dau cua toi tuong
class Persion{
    var name:String =""
    var age:Int = 0
}
// apply dung de cau hinh thuoc tinh tra ve
val persion = Persion().apply{
    name = "Hoang Quang"
    age = 22
}
// run giong let va apply tra ve ket qua giong apply
class KetQua{
    var monHoc:String? =""
    var diemSo: Double? = null
}
var ketqua = KetQua().run{
        monHoc = "Toan"
    diemSo = 10.0
    "Diem so cua mon ${monHoc} la: ${diemSo}%"
}

// also tra ve giong apply nhung thuc hien them cac hanh dong
var danhSachCu = mutableListOf<Persion>(persion,
    Persion().apply{ name = "Hoang"
    age = 15})
var danhSachMoi = danhSachCu.filter { it.age <=20 }.also { "Da loc xong nhung nguoi co tuoi be hon 20" }.map{it.name}

// with chuyen gom nhom. dung voi obj chac chan khong null
class HinhChuNhat(var chieuDai:Int = 15, var chieuRong: Int = 10){}
var hinhChuNhat = HinhChuNhat()

fun main(args: Array<String>) {
    println("-----")
    tenNguoiDung?.let { println(it) }
    println("-----")
    println("Ho ten: ${persion.name} va tuoi la ${persion.age}")
    println("-----")
    println(ketqua)
    println("-----")
    println(danhSachMoi)
    with(hinhChuNhat){
        println("Chieu dai cua hinh chu nhat la: ${chieuDai} va co chieu rong la: ${chieuRong}" )
    }
}