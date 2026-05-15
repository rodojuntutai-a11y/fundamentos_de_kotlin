package edu.etec.ds.fundamentos

fun evaluarPositivo(numero: Int): String {
    return if (numero > 0) "Positivo" else "No positivo"

}

fun clasificarNumero(numero: Int): String {
    if (numero > 10) {
        return "Mayor a 10"
    }
    if (numero < 10) {
        return "Menor a 10"
    }
    return "Igual a 10"
}

fun evaluarEdad(edad: Int): String {
    if (edad in 18..<65) {
        return "Adulto"
    }
    if (edad in 0..18) {
        return "Menor de edad"
    }
    return "Adulto mayor"
}

fun obtenerDescuento(monto: Double): Double {
    if (monto > 200) {
        return 40 % monto
    }
    if (monto > 150) {
        return 30 % monto
    }
    if (monto > 100) {
        return 20 % monto
    }
    return 0 % monto
}

fun calcular(operador: Char, a: Int, b: Int): Double {

        if (operador == '+') {
            return (a + b).toDouble()
        }
        if (operador == '-') {
            return (a - b).toDouble()
        }
        if (operador == '*') {
            return (a * b).toDouble()
        }
        if (operador == '/') {
            if (b == 0) {
                return 0.0
            }
            return (a / b).toDouble()
        }
        return 0.0
    }
