package com.joaofsantos.testetargetsistemas

var INDICE: Int = 13
var SOMA: Int = 0
var K: Int = 0
fun main() {
    while (K < INDICE) {
        K = K + 1
        SOMA = SOMA + K
    }
    println("$SOMA");
};