package Tuan_1.buoi_4

//forEach: Duyệt qua từng phần tử để thực hiện một hành động nào đó.
//map: Biến đổi tất cả các phần tử trong danh sách cũ thành một danh sách mới.
//filter: Lọc ra các phần tử thỏa mãn điều kiện.
//sortedBy: Sắp xếp danh sách theo một tiêu chí nhất định.
//find: Tìm phần tử đầu tiên thỏa mãn điều kiện.
fun main(args: Array<String>) {
    var danhSachDiem = listOf(8,9,10,5,6,7)
    danhSachDiem.forEach{
        println("Diem lan luot la: "+ it)
    }
    var diemDauVao= danhSachDiem.filter { it > 8 } // it dai diem cho phan tu trong list
    println("Diem dau vao la: $diemDauVao")
    var diemBinhPhuong = danhSachDiem.map { it * it }
    println("Diem Phuong: $diemBinhPhuong")
    var danhSachDaSapXep = danhSachDiem.sorted()
    println("SapXep: $danhSachDaSapXep")
}