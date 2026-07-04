package Tuan_1.buoi_3
//Viết một hàm hienThiDonHang gồm 3 tham số: tenSanPham (String), soLuong (Int), và phiShip (Int) với giá trị mặc định của phiShip là 15000.
//Trong main(), hãy gọi hàm này 2 lần:
//Lần 1: Chỉ truyền tenSanPham và soLuong (để hệ thống tự lấy phiShip mặc định).
//Lần 2: Truyền đủ 3 tham số, nhưng đảo lộn thứ tự truyền vào bằng cách sử dụng tham số có tên (Named arguments).
fun hienThiDonHang(tenSanPham: String, soLuong: Int, phiShip: Int = 15000) {
    println("Ten san pham: "+ tenSanPham)
    println("So luong: "+ soLuong)
    println("Phi Ship: "+ phiShip)
}
fun main(args: Array<String>) {
    println("In lan 1:")
    hienThiDonHang("Mi tom thang luong", 90000)
    println("In lan 2:")
    hienThiDonHang(phiShip = 12000, soLuong = 33,tenSanPham = "ca chua xao sau rieng",)
}