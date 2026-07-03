package Buoi_5

//Copy đoạn code sealed class UiState ở phần lý thuyết vào Playground.
//Trong hàm main(), hãy thử truyền lần lượt UiState.Loading,
//UiState.Success(listOf("Phim A", "Phim B")), và UiState.Error("Mất mạng")
//vào hàm hienThiManHinh() để xem kết quả hoạt động của when.

sealed class UiState2{
    object Loading : UiState2()
    data class  Sucess(val danhSach: List<String>) : UiState2()
    data class Error(val Loi: String) : UiState2()
}
fun hienThiManHinh(uiState: UiState2) {
    when(uiState){
        is UiState2.Loading -> { println("Loading...") }
        is UiState2.Sucess -> { println("${uiState.danhSach}")}
        is UiState2.Error -> {println("${uiState.Loi}")}
    }
}

fun main() {
    hienThiManHinh(UiState2.Loading)
    hienThiManHinh(UiState2.Sucess(listOf("Phim A", "Phim B")))
    hienThiManHinh(UiState2.Error("Mat mang"))
}