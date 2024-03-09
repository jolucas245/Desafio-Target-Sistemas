fun main() {
    var n = 22 // Coloque nesta linha o valor que deseja verificar se está na sequência de Fibonacci
    var mensagem = when {
        estaEmFibonacci(n) -> "O número $n ESTÁ na sequência de Fibonacci"
        else -> {
            "O número $n NÃO ESTÁ na sequência de Fibonacci"
        }
    }
    println(mensagem)
}

fun estaEmFibonacci(n: Int): Boolean{
    var a = 0
    var b = 1
    while(b < n){
        var temp = b
        b += a
        a = temp
    }
    return b == n
}