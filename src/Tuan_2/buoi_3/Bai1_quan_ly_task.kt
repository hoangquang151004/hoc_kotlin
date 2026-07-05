package Tuan_2.buoi_3
//Mục tiêu: Ứng dụng data class để lưu trữ dữ liệu , enum class để giới hạn trạng thái , và dùng các hàm xử lý danh sách như filter, forEach.
//Yêu cầu:
//Tạo một enum class tên là MucDoUuTien gồm 3 giá trị: CAO, TRUNG_BINH, THAP.
//Tạo một data class tên là CongViec gồm: id (Int), tenTask (String), mucDo (Kiểu MucDoUuTien), và daHoanThanh (Boolean - mặc định gán là false).
//Tạo một class QuanLyCongViec chứa một MutableList<CongViec> rỗng.
//Trong class QuanLyCongViec, viết các hàm sau:
//themTask(task: CongViec): Thêm một công việc mới vào danh sách.
//hoanThanhTask(id: Int): Tìm công việc có id tương ứng (gợi ý dùng hàm find) và đổi daHoanThanh thành true. (Lưu ý: thuộc tính của data class thường là val, nếu muốn đổi giá trị bạn cần khai báo nó là var, hoặc dùng hàm .copy()).
//inTaskTheoUuTien(mucDoCanTim: MucDoUuTien): Dùng hàm filter lọc ra các task chưa hoàn thành và có mức độ ưu tiên khớp với tham số truyền vào. Dùng forEach để in danh sách đó ra.
//Khởi tạo đối tượng quản lý, thêm 4-5 task đa dạng và gọi thử các hàm trên trong main().

enum class MucDoUuTien{
    CAO, TRUNG_BINH, THAP
}
data class CongViec(var id: Int, var tenTask: String, var mucDo: MucDoUuTien, var daHoanThanh: Boolean =false)

class QuanLyCongViec(var danhSachCongViec: MutableList<CongViec>){
    fun ThemTask(task: CongViec){
        this.danhSachCongViec.add(task)
    }
    fun hoanThanhTask(id: Int){
        var congViec = danhSachCongViec.find{ it.id == id}
        congViec?.daHoanThanh = true
        println("Cong viec co ${id}: da hoan thanh")
    }
    fun inTaskUuTien(mucDoCanTim: MucDoUuTien){
        var danhSachTask = danhSachCongViec.filter{ it.daHoanThanh == false && it.mucDo == mucDoCanTim }
        danhSachTask.forEach {
            println("TaskID: ${it.id}, ten task: ${it.tenTask}, Muc do: ${it.mucDo}")
        }
    }
}

fun main() {
    var quanLyCongViec = QuanLyCongViec(mutableListOf() )
    quanLyCongViec.ThemTask(CongViec(1, "viet code", MucDoUuTien.CAO) )
    quanLyCongViec.ThemTask(CongViec(2, "hoc ly thuyet", MucDoUuTien.CAO) )
    quanLyCongViec.ThemTask(CongViec(3,"di ngam gai", MucDoUuTien.TRUNG_BINH) )
    quanLyCongViec.ThemTask(CongViec(4,"Luot top top", MucDoUuTien.THAP) )

    quanLyCongViec.inTaskUuTien(MucDoUuTien.CAO)
    quanLyCongViec.inTaskUuTien(MucDoUuTien.TRUNG_BINH)
    quanLyCongViec.inTaskUuTien(MucDoUuTien.THAP)

    quanLyCongViec.hoanThanhTask(1)
    quanLyCongViec.inTaskUuTien(MucDoUuTien.CAO)
}
