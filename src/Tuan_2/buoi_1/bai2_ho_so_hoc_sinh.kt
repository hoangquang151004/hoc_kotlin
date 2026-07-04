package Tuan_2.buoi_1

//Tạo một class HocSinh với Primary Constructor gồm 3 tham số: maHS (String), ten (String), diemToan (Double). Lưu ý: Không dùng val/var ở đây, hãy tự khai báo thuộc tính trong thân class.
//Trong thân class, khai báo các thuộc tính (properties) tương ứng. Sử dụng từ khóa this trong khối init {} để gán tham số truyền vào cho các thuộc tính của class.
//Tạo một Secondary Constructor (hàm khởi tạo phụ) chỉ nhận vào maHS và ten. Nếu tạo học sinh bằng constructor này, truyền giá trị mặc định của diemToan là 0.0 thông qua this().
//Trong hàm main(), tạo 1 học sinh bằng Primary Constructor (có điểm toán) và 1 học sinh bằng Secondary Constructor (chưa có điểm). In thông tin của cả 2 ra màn hình.

class HocSinh( maHocSinh:String, ten:String, diemToan:Double){
    var maHocSinh: String
    var ten:String
    var diemToan: Double
    init{
        this.maHocSinh = maHocSinh
        this.ten = ten
        this.diemToan = diemToan
    }
    constructor( maHocSinh: String , tenHocSinh: String): this(maHocSinh, tenHocSinh, 0.0){
    }
}

fun main(args: Array<String>) {
   var  hocSinh1 = HocSinh("DA1","quang",9.2)
    var hocSinh2 = HocSinh("DA2","hoang",)
    println("Thong tin hoc sinh 1 la : ${hocSinh1.maHocSinh} ,  ${hocSinh1.ten},  ${hocSinh1.diemToan}")
    println("Thong tin hoc sinh 2 la : ${hocSinh2.maHocSinh} ,  ${hocSinh2.ten},  ${hocSinh2.diemToan}")
}