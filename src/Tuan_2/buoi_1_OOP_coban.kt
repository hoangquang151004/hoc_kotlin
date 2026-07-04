package Tuan_2

class XeHoi(var hangXe: String, var mauXac:String, var namSanXuat:Int){
    var tocDoHienTai: Int = 0
    constructor(hangXe: String,mauXac:String) : this(hangXe,mauXac,2025){
        println("Da khoi tao xe $hangXe bang Secondary Constructor")
    }
    fun tangToc (tocDoThem: Int){
        this.tocDoHienTai += tocDoThem
        println("Hang xe ${this.hangXe} dang chay voi toc do ${this.tocDoHienTai}")
    }
}

fun main(args: Array<String>) {
    var xe1 = XeHoi("toyota","xa la",2023)
    println("xe 1 la hang: ${xe1.hangXe} co mau la ${xe1.mauXac} co nam san xuat la: ${xe1.namSanXuat} ")
    var xe2 = XeHoi("honda","do")
    println("xe 1 la hang: ${xe2.hangXe} co mau la ${xe2.mauXac} co nam san xuat la: ${xe2.namSanXuat} ")
    xe1.tangToc(1234)
    xe2.tangToc(32)

}