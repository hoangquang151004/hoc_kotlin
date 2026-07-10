package Tuan_3

class ChiecHop<T>(val duLieu:T){
    fun layDuLieu():T{
        return duLieu
    }
}

// Tu khoa out
open class ThuCung
class Cho : ThuCung()
class CuaHang<out T> (val vatNuoi: T){
fun banThuCung():T{
    return vatNuoi
}
    // loi khong duoc them
//fun themThuCung(val thuCung: T):T{
//    return thuCung
//}
}

// tu khoa in
class BacSi<in T> {
    fun chuaChoBenhNhan(benhNhan: T){
        println("Dang chua cho benh Nhan: $benhNhan")
    }
}


fun main() {
    var chiecHopSo = ChiecHop(5)
    println(chiecHopSo.layDuLieu())
    var chietHopChu = ChiecHop("Day la to 5 nghin dong")
    println(chietHopChu.layDuLieu())

    var cuaHangCho = CuaHang<Cho>(Cho())
    var cuaHangThuCung: CuaHang<ThuCung> = cuaHangCho

    val bacSiThuCung = BacSi<ThuCung>()
    val bacSiCho: BacSi<ThuCung> = bacSiThuCung
    bacSiCho.chuaChoBenhNhan(Cho())


}