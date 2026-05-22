package edu.etec.ds.fundamentos

fun obtenerDiaSemana(dia: Int): String {
    val nombreDia = when (dia) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miércoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sabado"
        7 -> "Domingo"
        else -> "Dia invalido"
    }
    return nombreDia
}

fun obtenerNombreMes(mes: Int): String {
    val nombreMes = when (mes) {
        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abril"
        5 -> "Mayo"
        6 -> "Junio"
        7 -> "Julio"
        8 -> "Agosto"
        9 -> "Septiembre"
        10 -> "Octubre"
        11 -> "Noviembre"
        12 -> "Diciembre"
        else -> "Mes invalido"
    }
    return nombreMes
}



fun clasificarNumeroWhen(numero: Int): String {
    val clasificacion = when  {
        numero > 0  -> "Positivo"
        numero  < 0 -> "Negativo"
        else -> "Cero"
    }
    return clasificacion
}

fun clasificarEdad(edad: Int): String {
    val clasificaEdad = when (edad) {
        in 0..3 -> "Bebe"
        in 4..12 -> "Nino"
        in 13..17 -> "Adolescente"
        in 18..65 -> "Adulto"
        else -> "Anciano"
    }
    return clasificaEdad
}

fun convertirMoneda(moneda: String, monto: Double): Double {
    return when (moneda){
        "USD" -> 1.85 * monto
        "EUR" ->  18.0 * monto
        "JPY" ->  0.10 * monto
        else -> 0.0

        }

}

fun realizarOperacion(operador: Char, a: Int, b: Int): Double {
    return when (operador) {
        '+' -> (a + b).toDouble()
        '-' -> (a - b).toDouble()
        '*' -> (a * b).toDouble()
        '/' -> if (b != 0) (a / b).toDouble() else 0.0
        '%' -> if (b != 0) (a % b).toDouble() else 0.0
        else -> 0.0
    }
}

fun obtenerDescuentoWhen(monto: Double): Double {
    return when {
        monto > 200 -> monto * 0.10
        monto > 150 -> monto * 0.15
        monto > 100 -> monto * 0.10
        else -> 0.0
    }
}

fun obtenerCalificacion(nota: Int): String {
    return when {
        nota >= 90 -> "Promocionado"
        nota >= 60 -> "Aprobado"
        else -> "Desaprobado"
    }
}


fun esVocal(caracter: Char): Boolean {
    val texto = "aeiouAEIOU"
    return when (caracter){
        in texto -> true
        else -> false
    }
}

fun esPrimo(numero: Int): Boolean {
    val primos = setOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29,31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 79, 83,89, 97)
    return when (numero){
        in primos -> true
        else -> false
    }
}
