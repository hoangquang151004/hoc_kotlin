package Tuan_2.buoi_3
// giong enum nhung mang theo du lieu
sealed class UiState{
    object Loading : UiState()
    data class Success(val danhSachPhim: List<String>) : UiState()
    data class Error(val thongBaoLoi: String) : UiState()
}
fun hienThiManHinh(state: UiState){
    when(state){
        is UiState.Loading -> println("Dang tai")
        is UiState.Success -> println("Tai xong roi hien thi danh sach phim ${state.danhSachPhim}")
        is UiState.Error -> println("Loi roi : ${state.thongBaoLoi}")
    }
}
fun main() {
    val trangThaiManHinh = UiState.Success(listOf("Phim A", "Phim B"))
    hienThiManHinh(trangThaiManHinh)
}