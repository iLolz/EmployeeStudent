package br.edu.unifei.ecoi09.observer

import javax.swing.JOptionPane

fun SearchStudent(Pessoas: ArrayList<Student>) {

    if (Pessoas.isNotEmpty()) {
        println("Deseja buscar pelo nome ou pelo CPF ?")
        println("1) Nome")
        println("2) CPF")

        var op = readLine()!!

        when (op) {

            "1" -> {

                println("Digite o Nome do usuário a ser encontrado :")
                var search: String = readLine()!!.toUpperCase()

                for (student: Student in Pessoas) {
                    if ((student.name).toUpperCase().contains(search)) {

                        println("Nome : ${student.name}")
                        println("Contato : ${student.contact}")
                        println("CPF : ${student.CPF}")
                        println("Data de matricula : ${student.born}")
                        println("Matricula : ${student.matricula}")
                        println("Endereco :  ${student.address} \n \n")
                    }
                }
            }

            "2" -> {
                println("Digite o CPF do usuário a ser encontrado :")
                var search: String = readLine()!!

                for (student: Student in Pessoas) {
                    if (student.CPF.contains(search)) {

                        println("Nome : ${student.name}")
                        println("Contato : ${student.contact}")
                        println("CPF : ${student.CPF}")
                        println("Data de matricula : ${student.born}")
                        println("Matricula : ${student.matricula}")
                        println("Endereco :  ${student.address} \n \n")
                    }
                }
            }

            else -> {
                println("Opçao invalida")
                SearchStudent(Pessoas)
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Não há usuários cadastrados!")
    }
}