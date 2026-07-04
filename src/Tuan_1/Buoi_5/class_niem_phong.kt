package Tuan_1.Buoi_5

sealed class UiState{
    object Loading : UiState()
    data class Success(val danhSach: List<String>) : UiState()
    data class Error (val thongBaoLoi: String) : UiState()
}
fun hienThiManHinh(state: UiState){
    when(state){
        is UiState.Loading -> println("Loading")
        is UiState.Success -> println("Tai Thanh cong: ${state.danhSach}")
        is UiState.Error -> println("Tai loi: ${state.thongBaoLoi}")
    }
}
fun main() {
    hienThiManHinh(UiState.Success(listOf("A", "B", "C")))
}

