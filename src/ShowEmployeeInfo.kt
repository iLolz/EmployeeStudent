package br.edu.unifei.ecoi09.observer

import javax.swing.JOptionPane

fun ShowEmployeeInfo(Lista: ArrayList<Employee>) {
    if (Lista.isEmpty()) {
        JOptionPane.showMessageDialog(null,"Nao há funcionários cadastrados!")
    } else {
        for (employee: Employee in Lista) {

            println("Nome : ${employee.name}")
            println("CPF : ${employee.CPF}")
            println("Contato : ${employee.contact}")
            println("Endereço : ${employee.address}")
            println("Setor : ${employee.setor}")
            println("Cargo : ${employee.cargo}")
            println("Identificador : ${employee.identificador}")
            println("Data de cadastro : ${employee.born}\n\n")
        }
    }
}