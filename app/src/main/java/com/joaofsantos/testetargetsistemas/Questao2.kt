package com.joaofsantos.testetargetsistemas

fun main() {
    println("Digite o Valor de FIBONACCI")
    val pergunta = readLine()?.toInt()

    if (pergunta != null) {
        println("Fibonacci: 0")
        println("Fibonacci: 1")

        var n1 = 0
        var n2 = 1
        var fibonacci = 0
        var fibonacciCorreto = false

        while (fibonacci <= pergunta) {
            if (fibonacci == pergunta) {
                fibonacciCorreto = true
                break
            }
            val temp = n1 + n2
            n1 = n2
            n2 = temp
            fibonacci = temp
            println("Fibonacci: $fibonacci")
        }

        if (fibonacciCorreto) {
            println("O Valor do fibonacci: $fibonacci está correto")
        } else {
            println("O valor de $pergunta está incorreto")
        }
    } else {
        println("Entrada inválida. Por favor, insira um número.")
    }
}
