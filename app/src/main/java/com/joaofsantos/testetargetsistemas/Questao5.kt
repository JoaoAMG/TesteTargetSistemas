package com.joaofsantos.testetargetsistemas


fun main() {
    var string = "O Rato Roeu A Roupa do Rei de Roma"

    val Tamanho = string.length
    var Stringinvertida= ""
    for (i in Tamanho - 1 downTo 0) {
        Stringinvertida+= string[i]
    }

    println("$Stringinvertida")
}
