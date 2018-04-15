package br.edu.unifei.ecoi09.observer

import javax.swing.JOptionPane


fun RemoveStudent(ArrayStudent: ArrayList<Student>): ArrayList<Student> {
    if (ArrayStudent.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Não há usuários cadastrados!")
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

                    for (student: Student in ArrayStudent) {

                        //Verificar se o erro nao está em procurar nome quando nao mais nada a ser procurado ( erro ao deletar ultimo funcionario)

                        if ((student.name).toUpperCase().contains(search)) {

                            println("Nome : ${student.name}")
                            println("Contato : ${student.contact}")
                            println("CPF : ${student.CPF}")
                            println("Data de matricula : ${student.born}")
                            println("Matricula : ${student.matricula}")
                            println("Endereco :  ${student.address} \n \n")

                            println("Deseja remover este funcionário?")
                            println("1) Sim")
                            println("2) Não")
                            println("0) Sair")

                            var opConfirm: String = readLine()!!

                            do {
                                when (opConfirm) {
                                    "1" -> { ///REVER ESSA FUNCAO


                                        if (ArrayStudent.remove(student)) {
                                            println("Funcionário removido com sucesso!")
                                            return ArrayStudent
                                        }
                                    }

                                    "2" -> {
                                        opConfirm = "0"
                                        if (student == ArrayStudent.last()) // se for ultimo da lista sai da repetiçao
                                            return ArrayStudent
                                    }
                                    "0" -> {
                                        return ArrayStudent
                                    }
                                }
                            } while (opConfirm != "0")
                        }
                    }
                }

                "2" -> {
                    println("Digite o CPF do funcionário a ser removido :")
                    var search: String = readLine()!!

                    for (student: Student in ArrayStudent) {

                        //Verificar se o erro nao está em procurar nome quando nao mais nada a ser procurado ( erro ao deletar ultimo funcionario)

                        if ((student.CPF).toUpperCase().contains(search)) {

                            println("Nome : ${student.name}")
                            println("Contato : ${student.contact}")
                            println("CPF : ${student.CPF}")
                            println("Data de matricula : ${student.born}")
                            println("Matricula : ${student.matricula}")
                            println("Endereco :  ${student.address} \n \n")

                            println("Deseja remover este funcionário?")
                            println("1) Sim")
                            println("2) Não")
                            println("0) Sair")

                            var opConfirm: String = readLine()!!

                            do {
                                when (opConfirm) {
                                    "1" -> { ///REVER ESSA FUNCAO

                                        if ((student == ArrayStudent.last()) && (ArrayStudent.size > 1)) {

                                            var tam = ArrayStudent.size - 1
                                            ArrayStudent[tam] = ArrayStudent[tam - 1]
                                            if (ArrayStudent.remove(ArrayStudent[tam - 1])) {
                                                println("Funcionário removido com sucesso!")
                                                return ArrayStudent
                                            }

                                        } else if ((student == ArrayStudent.last()) && (ArrayStudent.size < 2)) {
                                            if (ArrayStudent.remove(student)) {
                                                println("Funcionário removido com sucesso!")
                                                return ArrayStudent
                                            }

                                        } else {
                                            if (ArrayStudent.remove(student)) {
                                                println("Funcionário removido com sucesso!")
                                                return ArrayStudent
                                            }
                                        }
                                        ShowStudentInfo(ArrayStudent)
                                    }

                                    "2" -> {
                                        opConfirm = "0"
                                        if (student == ArrayStudent.last()) // se for ultimo da lista sai da repetiçao
                                            return ArrayStudent
                                    }
                                    "0" -> {
                                        return ArrayStudent
                                    }
                                }
                            } while (opConfirm != "0")
                        }
                    }
                }
            }
        } while (op != "1" || op != "2")
    }
    return ArrayStudent
}