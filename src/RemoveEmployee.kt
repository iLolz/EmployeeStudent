package br.edu.unifei.ecoi09.observer

import javax.swing.JOptionPane


fun RemoveEmployee(ArrayEmployee: ArrayList<Employee>): ArrayList<Employee> {
    if (ArrayEmployee.isEmpty()) {
        JOptionPane.showMessageDialog(null,"Não há funcionários cadastrados!")
    } else {

        println("Deseja buscar pelo nome ou pelo CPF ?")
        println("1) Nome")
        println("2) CPF")

        var op = readLine()!!
        do {
            when (op) {

                "1" -> {
                    println("Digite o Nome do usuário a ser removido :")
                    var search: String = readLine()!!.toUpperCase()

                    for (employee: Employee in ArrayEmployee) {

                        //Verificar se o erro nao está em procurar nome quando nao mais nada a ser procurado ( erro ao deletar ultimo funcionario)

                        if ((employee.name).toUpperCase().contains(search)) {

                            println("Nome : ${employee.name}")
                            println("CPF : ${employee.CPF}")
                            println("Contato : ${employee.contact}")
                            println("Endereço : ${employee.address}")
                            println("Setor : ${employee.setor}")
                            println("Cargo : ${employee.cargo}")
                            println("Identificador : ${employee.identificador}")
                            println("Data de cadastro : ${employee.born}")

                            println("Deseja remover este funcionário?")
                            println("1) Sim")
                            println("2) Não")
                            println("0) Sair")

                            var opConfirm: String = readLine()!!

                            do {
                                when (opConfirm) {
                                    "1" -> { ///REVER ESSA FUNCAO


                                            if (ArrayEmployee.remove(employee)) {
                                                println("Funcionário removido com sucesso!")
                                                return ArrayEmployee
                                            }
                                    }

                                    "2" -> {
                                        opConfirm = "0"
                                        if (employee == ArrayEmployee.last()) // se for ultimo da lista sai da repetiçao
                                            return ArrayEmployee
                                    }
                                    "0" -> {
                                        return ArrayEmployee
                                    }
                                }
                            } while (opConfirm != "0")
                        }
                    }
                }

                "2" -> {
                    println("Digite o CPF do funcionário a ser removido :")
                    var search: String = readLine()!!

                    for (employee: Employee in ArrayEmployee) {

                        //Verificar se o erro nao está em procurar nome quando nao mais nada a ser procurado ( erro ao deletar ultimo funcionario)

                        if ((employee.CPF).toUpperCase().contains(search)) {

                            println("Nome : ${employee.name}")
                            println("CPF : ${employee.CPF}")
                            println("Contato : ${employee.contact}")
                            println("Endereço : ${employee.address}")
                            println("Setor : ${employee.setor}")
                            println("Cargo : ${employee.cargo}")
                            println("Identificador : ${employee.identificador}")
                            println("Data de cadastro : ${employee.born}")

                            println("Deseja remover este funcionário?")
                            println("1) Sim")
                            println("2) Não")
                            println("0) Sair")

                            var opConfirm: String = readLine()!!

                            do {
                                when (opConfirm) {
                                    "1" -> { ///REVER ESSA FUNCAO

                                        if ((employee == ArrayEmployee.last()) && (ArrayEmployee.size > 1)) {

                                            var tam = ArrayEmployee.size - 1
                                            ArrayEmployee[tam] = ArrayEmployee[tam - 1]
                                            if (ArrayEmployee.remove(ArrayEmployee[tam - 1])) {
                                                println("Funcionário removido com sucesso!")
                                                return ArrayEmployee
                                            }

                                        } else if ((employee == ArrayEmployee.last()) && (ArrayEmployee.size < 2)) {
                                            if (ArrayEmployee.remove(employee)) {
                                                println("Funcionário removido com sucesso!")
                                                return ArrayEmployee
                                            }

                                        } else {
                                            if (ArrayEmployee.remove(employee)) {
                                                println("Funcionário removido com sucesso!")
                                                return ArrayEmployee
                                            }
                                        }
                                        ShowEmployeeInfo(ArrayEmployee)
                                    }

                                    "2" -> {
                                        opConfirm = "0"
                                        if (employee == ArrayEmployee.last()) // se for ultimo da lista sai da repetiçao
                                            return ArrayEmployee
                                    }
                                    "0" -> {
                                        return ArrayEmployee
                                    }
                                }
                            } while (opConfirm != "0")
                        }
                    }
                }
            }
        } while ((op != "1" || op != "2"))
    }
    return ArrayEmployee
}