package br.edu.unifei.ecoi09.observer

import javax.swing.JFrame
import javax.swing.JOptionPane
import javax.swing.JPanel

fun SearchEmployee(Pessoas: ArrayList<Employee>) {
    if (Pessoas.isNotEmpty()) {

        val painel = JFrame("Buscar funcionário")
        painel.setBounds(10,10,300,100)
        painel.isVisible

        println("Deseja buscar pelo nome ou pelo CPF ?")
        println("1) Nome")
        println("2) CPF")

        var op = readLine()!!

        when (op) {

            "1" -> {

                println("Digite o Nome do usuário a ser encontrado :")
                var search: String = readLine()!!.toUpperCase()

                for (employee: Employee in Pessoas) {
                    if ((employee.name).toUpperCase().contains(search)) {

                        println("Nome : ${employee.name}")
                        println("CPF : ${employee.CPF}")
                        println("Contato : ${employee.contact}")
                        println("Endereço : ${employee.address}")
                        println("Setor : ${employee.setor}")
                        println("Cargo : ${employee.cargo}")
                        println("Identificador : ${employee.identificador}")
                        println("Data de cadastro : ${employee.born}")
                    }
                }
            }

            "2" -> {
                println("Digite o CPF do usuário a ser encontrado :")
                var search: String = readLine()!!

                for (employee: Employee in Pessoas) {
                    if (employee.CPF.contains(search)) {

                        println("Nome : ${employee.name}")
                        println("CPF : ${employee.CPF}")
                        println("Contato : ${employee.contact}")
                        println("Endereço : ${employee.address}")
                        println("Setor : ${employee.setor}")
                        println("Cargo : ${employee.cargo}")
                        println("Identificador : ${employee.identificador}")
                        println("Data de cadastro : ${employee.born}")
                    }
                }
            }

            else -> {
                println("Opçao invalida")
                SearchEmployee(Pessoas)
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Não há usuários cadastrados!")
    }
}