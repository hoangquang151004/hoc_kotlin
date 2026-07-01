package buoi_3
//Khai báo một biến kiemTraChanLe chứa một Lambda expression.
//Lambda này nhận vào một số nguyên, nếu chia hết cho 2 thì trả về chuỗi "Là số chẵn", ngược lại trả về "Là số lẻ".
//In ra kết quả khi truyền số 7 và số 10 vào lambda đó.
var kiemTraChan = {a: Int -> if (a%2 ==0){
println("$a la so chan")}
else println("$a la so le")
    }
fun main(args: Array<String>) {
    println("kiem tra chan le cua 7: ")
    kiemTraChan(7)
    println("kiem tra chan le cua 10: ")
    kiemTraChan(10)
}