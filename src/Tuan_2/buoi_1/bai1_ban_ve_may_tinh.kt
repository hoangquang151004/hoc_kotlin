package Tuan_2.buoi_1

class MayTinh (var thuongHieu: String,var chip: String, var ram:Int){
//    Tạo một class MayTinh với Primary Constructor nhận vào 3 thuộc tính: thuongHieu (String), //    chip (String), và ram (Int). Nhớ dùng từ khóa val hoặc var trong dấu ().
//    Khai báo thêm một thuộc tính bên trong thân class là dangBat (Boolean), gán giá trị mặc định là false.
//    Viết một hàm tên là batMay() bên trong class. Khi gọi hàm này, đổi giá trị dangBat thành true và in ra dòng chữ: "Máy tính [thuongHieu] đã được bật!".
//    Trong hàm main(), khởi tạo một chiếc máy tính của bạn (VD: Macbook, chip M2, ram 16), in cấu hình ra màn hình và gọi hàm batMay().
    var dangBat: Boolean = false
    fun batMay(){
        this.dangBat = true
        println("May tinh ${this.thuongHieu} da duoc bat")
    }

}

fun main(args: Array<String>) {
    var mayTinh1 = MayTinh("Macbook","chip M2", 16)
    println("cau hinh may la : May tinh: ${mayTinh1.thuongHieu}, co chip:  ${mayTinh1.chip} va ram: ${mayTinh1.ram}")
    mayTinh1.batMay()
}