package Tuan_2.buoi_2

open class DongVat{
    open fun phatAmThanh(){
        println("Dong vat dang keu ...")
    }
}
class Cho: DongVat(){
    override fun phatAmThanh(){
        println("Cho keu Gau Gau")
    }
}
class Meo: DongVat(){
    override fun phatAmThanh(){
        println("Con meo keu meo meo")
    }
}

fun main() {
    var dongVat1 : DongVat = Cho()
    var dongVat2 : DongVat = Meo()
    dongVat1.phatAmThanh()
    dongVat2.phatAmThanh()
}
