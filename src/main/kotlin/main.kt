fun main() {
    println("Bem Vindo ao ByteBank")
    println("----------------------------------------------------------")

    for (i in 9 downTo 1 step 2) {
        val titular: String = "Rodrigo Eustáquio Duque $i"
        val numeroConta: Int = 100048 + i
        var saldo: Double = 10.0 + i


        println("Titular: $titular")
        println("Número da Conta: $numeroConta")
        println("Saldo da Conta: $saldo")
        println("----------------------------------------------------------")


    }


    fun testaCondicoes(saldo: Double) {
        if (saldo > 0.0) {
            println("Conta é positiva")
        } else if (saldo == 0.0) {
            println("Conta é neutra")
        } else {
            println("Conta é negativa")
        }

        when {
            saldo > 0.0 -> println("Conta é positiva")
            saldo == 0.0 -> println("Conta é neutra")
            else -> println("Conta é negativa")
        }
    }
}