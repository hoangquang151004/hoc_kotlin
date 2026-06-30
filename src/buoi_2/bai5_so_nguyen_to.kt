package buoi_2

//Khai báo một số nguyên n. Dùng vòng lặp để kiểm tra xem n có phải là số nguyên tố
//hay không (Số nguyên tố là số lớn hơn 1 và chỉ chia hết cho 1 và chính nó).
//In ra kết quả "Là số nguyên tố" hoặc "Không là số nguyên tố".
fun main(args: Array<String>) {
    var n = 7
    for (i in 2 .. n-1){
        if (n%i==0) {
            println("$i khong la so nguyen to")
            return
        }
    }
    println("$n la so nguyen to")
}