package Tuan_2.buoi_2

//Tạo một abstract class tên là PhuongTien với thuộc tính private bienSo (String).
//Viết một custom getter để lấy biển số nhưng bị che mất 2 số cuối (VD: "29A-123.XX"). Viết một hàm abstract fun diChuyen(). (Áp dụng Trừu tượng và Đóng gói).

//Tạo class XeOTo kế thừa từ PhuongTien, truyền vào bienSo và thuộc tính soCua (Int).
//Cung cấp nội dung cụ thể cho hàm diChuyen() in ra "Ô tô chạy bằng 4 bánh". (Áp dụng Kế thừa).

//Tạo class XeMay kế thừa từ PhuongTien, truyền vào bienSo và loaiXe (String).
//Cung cấp nội dung cụ thể cho hàm diChuyen() in ra "Xe máy chạy bằng 2 bánh". (Áp dụng Kế thừa).

//Trong hàm main(), tạo một danh sách (List) chứa 1 XeOTo và 1 XeMay. Dùng vòng lặp duyệt qua danh sách,
//gọi hàm diChuyen() và in ra biến số đã được che của từng phương tiện. (Áp dụng Đa hình).
abstract class PhuongTien( private var bienSo:String = "23A-123.X.X"){

    val layBienSo: String
        get()= bienSo.dropLast(2)
    open fun diChuyen(){};
}
class XeOTO(bienSo:String, SoCua: Int):PhuongTien(bienSo){
    override fun diChuyen(){
        println("o to chay bang 4 banh")
    }
}
class XeMay(bienSo:String, loaiXe:String):PhuongTien(bienSo){
    override fun diChuyen(){
        println("Xe may chay bang 2 banh")
    }
    }


fun main() {
    var danhSachPhuongTien = listOf(XeOTO("23B1.12.3.4",2), XeMay("30AB.4532","Xe May"))
    danhSachPhuongTien.forEach{
        it.diChuyen()
        println("Bien so xe cua phuong tien la: ${it.layBienSo}X.X")
    }

}