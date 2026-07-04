package Tuan_1.buoi_2

fun main(args: Array<String>) {
//    Trò chơi FizzBuzz
//    Viết một vòng lặp chạy từ 1 đến 100.
//    Nếu số đó chia hết cho 3, in ra "Fizz".
//    Nếu số đó chia hết cho 5, in ra "Buzz".
//    Nếu số đó chia hết cho cả 3 và 5, in ra "FizzBuzz".
//    Nếu không thỏa mãn điều kiện nào, in ra chính số đó.
    for ( i in 1..100) {
        if (i%3 ==0 && i%5 ==0) {
        println("FizzBuzz")
        }
        else if (i%3 ==0) {
            println("Fizz")
        }
        else if (i%5 ==0) {
            println("Buzz")
        }
        else{
            println(i)
        }
    }
}