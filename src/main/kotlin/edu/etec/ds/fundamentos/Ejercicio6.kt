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
    return when (operador){
        '+' -> {(a + b)}
        '-' -> {(a - b)}
        '*' -> {(a * b)}
        '/' -> {(a / b)}
        '%' -> {(a % b)}
        else ->
            0.0
    } as Double

}

fun obtenerDescuentoWhen(monto: Double): Double {
    TODO("Usar when como expresion: >200 -> 25%, >150 -> 15%, >100 -> 10%, else 0%")
}

fun obtenerCalificacion(nota: Int): String {
    TODO("Usar when con rangos: >=90 Promocionado, >=60 Aprobado, else Desaprobado")
}

fun esVocal(caracter: Char): Boolean {
    TODO("Usar when para verificar si es vocal (a, e, i, o, u mayusculas y minusculas)")
}

fun esPrimo(numero: Int): Boolean {
    TODO("Usar when para determinar si un numero es primo (mayor a 1 divisible solo por 1 y si mismo)")
}
