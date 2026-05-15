package edu.etec.ds.fundamentos

fun sumarHasta(n: Int): Int {
    var contador = n
    if (n in 2..15) {
        while (contador < 15) {
            contador += 1
        }
    }
    return contador

}


fun contarPares(inicio: Int, fin: Int): Int {
    var contador = 0
    for (i in inicio..fin) {
        if (i % 2 == 0) {
            contador++
        }
    }
    return contador
}

fun fibonacci(n: Int): Int {
    if (n == 0) return 0
    if (n == 1) return 1
    var a = 0
    var b = 1
    for (i in 2..n) {
        val temp = a + b
        a = b
        b = temp
    }
    return b
}

fun factorial(n: Int): Int {
    var resultado = 1
    for (i in 1..n) {
        resultado *= i
    }
    return resultado
}

fun encontrarMaximo(numeros: List<Int>): Int {
    var maximo = numeros[0]
    for (numero in numeros) {
        if (numero > maximo) {
            maximo = numero
        }
    }
    return maximo
}

fun encontrarMinimo(numeros: List<Int>): Int {
    var minimo = numeros[0]
    for (numero in numeros) {
        if (numero < minimo) {
            minimo = numero
        }
    }
    return minimo
}

fun sumarLista(numeros: List<Int>): Int {
    var suma = 0
    for (numero in numeros) {
        suma += numero
    }
    return suma
}

fun inverter(texto: String): String {
    return texto.reversed()
}

fun contarVocales(texto: String): Int {
    var contador = 0
    val vocales = "aeiouAEIOU"
    for (letra in texto) {
        if (letra in vocales) {
            contador++
        }
    }
    return contador
}

fun esPalindromo(texto: String): Boolean {
    val limpio = texto.replace(" ", "").lowercase()
    return limpio == limpio.reversed()
}


fun tablaMultiplicar(numero: Int): List<Int> {
    val resultado = mutableListOf<Int>()
    for (i in 1..10) {
        resultado.add(numero * i)
    }
    return resultado
}

