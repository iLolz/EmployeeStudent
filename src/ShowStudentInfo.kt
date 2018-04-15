package br.edu.unifei.ecoi09.observer

import javax.swing.JOptionPane

fun ShowStudentInfo(Lista: ArrayList<Student>) {
    if (Lista.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Não há usuários cadastrados!")
    } else {
        for (pessoa: Student in Lista) {

            println("Nome : ${pessoa.name}")
            println("Contato : ${pessoa.contact}")
            println("CPF : ${pessoa.CPF}")
            println("Data de matricula : ${pessoa.born}")
            println("Matricula : ${pessoa.matricula}")
            println("Endereco :  ${pessoa.address} \n \n")
        }
    }
}