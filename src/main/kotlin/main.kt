fun main() {
    println("Bem Vindo ao ByteBank")
    println("----------------------------------------------------------")

    val contaRodrigo = Conta()
    contaRodrigo.titular = "Rodrigo Eustáquio Duque"
    contaRodrigo.numero = 1000
    contaRodrigo.saldo = 200.0

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0


    contaRodrigo.deposita(300.00)
    contaFran.deposita(500.00)
    contaRodrigo.deposita(1000.0)

    contaFran.sacar(850.00)
    contaRodrigo.sacar(300.00)

    contaFran.transferir(contaRodrigo, 500.00)
}


class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0


    fun deposita(valor: Double) {
        this.saldo += valor
        println("-------------------------Depósito---------------------------------")
        println("Depósito realizado com sucesso. Valor: $valor")
        println("Titular: ${this.titular} - Conta: ${this.numero}")
        println("Saldo Atual: ${this.saldo}")
        println("----------------------------------------------------------")
    }

    fun sacar(valor: Double) {
        if (valor > this.saldo) {

            println("Prezado ${this.titular} o valor solicitado para saque : R$ $valor é superior ao saldo existente em sua conta. Saldo Atual R$ ${this.saldo}")
        } else {
            this.saldo -= valor
            println("-------------------------Saque---------------------------------")
            println("Saque realizado com sucesso. Valor: $valor")
            println("Titular: ${this.titular} - Conta: ${this.numero}")
            println("Saldo Atual: ${this.saldo}")
            println("----------------------------------------------------------")
        }
    }


    fun transferir(contaDestino: Conta, valor: Double) {
        if (valor > this.saldo) {
            println("-------------------------Transferencia---------------------------------")
            println("Prezado ${this.titular} o valor solicitado para Transferencia : R$ $valor é superior ao saldo existente em sua conta. Saldo Atual R$ ${this.saldo}")
            println("----------------------------------------------------------")

        } else {
            println("-------------------------Transferencia---------------------------------")
            this.saldo -= valor
            contaDestino.saldo += valor
            println("Transferencia realizada com sucesso. Valor: $valor")
            println("Remetente: ${this.titular} - Conta: ${this.numero} - Valor: $valor")
            println("Saldo Conta ${this.titular} : R$ ${this.saldo}")
            println("Destinatário: ${contaDestino.titular} - Conta: ${contaDestino.numero}")
            println("Saldo Conta ${contaDestino.titular} : R$ ${contaDestino.saldo}")
            println("----------------------------------------------------------")


        }
    }
}

fun testaLacos() {

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