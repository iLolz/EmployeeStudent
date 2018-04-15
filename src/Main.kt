package br.edu.unifei.ecoi09.observer


import java.awt.*
import javax.swing.*
import java.awt.event.ActionListener
import java.awt.event.ActionEvent


fun main(args: Array<String>) {

    var StudentList = arrayListOf<Student>()
    var EmployeeList = arrayListOf<Employee>()

    val widBut = 200
    val heiBut = 30
    val xPosBut = 10
    val xPosBut2 = 200

    val f = JFrame("Cadastro aluno/funcionário")
    val b = JButton("Adicionar Estudante")
    val bAddFuncionario = JButton("Adicionar Funcionário")
    val bVerAluno = JButton("Ver Alunos")
    val bVerFunc = JButton("Ver Funcionarios")
    val bSearchA = JButton("Procurar Alunos")
    val bSearchF = JButton("Procurar Funcionários")
    val bRemoveA = JButton("Remover Aluno")
    val bRemoveF = JButton("Remover Funcionario")


    f.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    f.setSize(420, 140)
    f.isResizable = false
    f.setLocationRelativeTo(null)
    f.isVisible = true

    f.add(bVerAluno)
    f.add(bVerFunc)
    f.add(bSearchA)
    f.add(bSearchF)
    f.add(bRemoveA)
    f.add(bRemoveF)

    f.add(b)
    b.setBounds(10, 10, widBut, heiBut)
    b.background = Color.lightGray
    b.isVisible = true
    b.addActionListener(object : ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            AddStudent(StudentList) //To change body of created functions use File | Settings | File Templates.
        }

        fun actionPerformed(t: ActionListener) {
            AddStudent(StudentList)
        }
    })


    f.add(bAddFuncionario)
    bAddFuncionario.setBounds(xPosBut2, 10, widBut, heiBut)
    bAddFuncionario.background = Color.lightGray
    bAddFuncionario.isVisible = true
    bAddFuncionario.addActionListener(object : ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            AddEmployee(EmployeeList) //To change body of created functions use File | Settings | File Templates.
        }

        fun actionPerformed(e: ActionListener) {
            AddEmployee(EmployeeList)
        }
    })

    bVerAluno.setBounds(xPosBut, 35, widBut, heiBut)
    bVerAluno.addActionListener(object : ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            ShowStudentInfo(StudentList) //To change body of created functions use File | Settings | File Templates.
        }

        fun actionPerformed(f: ActionListener) {
            ShowStudentInfo(StudentList)
        }
    })

    bVerFunc.setBounds(xPosBut2, 35, widBut, heiBut)
    bVerFunc.addActionListener(object : ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            ShowEmployeeInfo(EmployeeList) //To change body of created functions use File | Settings | File Templates.
        }

        fun actionPerformed(g: ActionListener) {
            ShowEmployeeInfo(EmployeeList)
        }
    })

    bSearchA.setBounds(xPosBut, 60, widBut, heiBut)
    bSearchA.addActionListener(object : ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            SearchStudent(StudentList) //To change body of created functions use File | Settings | File Templates.
        }

        fun actionPerformed(h: ActionListener) {
            AddStudent(StudentList)
            SearchStudent(StudentList)
        }
    })

    bSearchF.setBounds(xPosBut2, 60, widBut, heiBut)
    bSearchF.addActionListener(object : ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            SearchEmployee(EmployeeList) //To change body of created functions use File | Settings | File Templates.
        }

        fun actionPerformed(i: ActionListener) {
            SearchEmployee(EmployeeList)
        }
    })

    bRemoveA.setBounds(xPosBut, 85, widBut, heiBut)
    bRemoveA.addActionListener(object : ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            RemoveStudent(StudentList) //To change body of created functions use File | Settings | File Templates.
        }

        fun actionPerformed(j: ActionListener) {
            RemoveStudent(StudentList)
        }
    })

    bRemoveF.setBounds(xPosBut2, 85, widBut, heiBut)
    bRemoveF.addActionListener(object : ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            RemoveEmployee(EmployeeList) //To change body of created functions use File | Settings | File Templates.
        }
        fun actionPerformed(k: ActionListener) {
            RemoveEmployee(EmployeeList)
        }
    })
}

