package br.edu.unifei.ecoi09.observer

import java.awt.BorderLayout
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import javax.swing.*
import kotlin.collections.ArrayList

fun AddStudent(StudentList: ArrayList<Student>): ArrayList<Student> {

    val widTxt = 300     //Largura campo de texto
    val heiTxt = 20     // altura campo de texto
    val xPosition = 80 // posicao x dos campos de texto

    // declaração da Janela

    val painel = JFrame("Adicionar Aluno")
    painel.setSize(420,200)
    painel.defaultCloseOperation = JFrame.DISPOSE_ON_CLOSE
    painel.isResizable = false
    painel.setLocationRelativeTo(null)
    painel.isVisible = true

    //                  Declaração de objetos

    val textEntryName = JTextField()
    val textEntryCPF = JTextField ()
    val textEntContact = JTextField()
    val textEntryEnd = JTextField()

    val textName = JLabel("Nome :")
    val textCPF = JLabel ( "CPF :")
    val textContact = JLabel( " Telefone :")
    val textAdress = JLabel ("Endereço :")
    var cadastra = JButton( "Cadastrar")

    //                  Configuração de caixas de texto

    textEntryName.isVisible = true
    textEntryName.setSize(widTxt, heiTxt)
    textEntryName.setLocation(xPosition,10)

    textEntryCPF.isVisible = true
    textEntryCPF.setSize(widTxt,heiTxt)
    textEntryCPF.setLocation(xPosition,40)

    textEntContact.isVisible = true
    textEntContact.setSize(widTxt,heiTxt)
    textEntContact.setLocation(xPosition,70)

    textEntryEnd.isVisible = true
    textEntryEnd.setSize(widTxt,heiTxt)
    textEntryEnd.setLocation(xPosition, 100)


    //                  Configuração Labels

    val xPositioLabel = 6

    textName.setSize(60,40)
    textName.setLocation(xPositioLabel,2)
    textName.isVisible = true

    textCPF.setSize(60,40)
    textCPF.setLocation(xPositioLabel,30)
    textCPF.isVisible = true

    textContact.isVisible = true
    textContact.setSize(200,40)
    textContact.setLocation(2,60)

    textAdress.setSize(90,40)
    textAdress.setLocation(xPositioLabel,90)
    textAdress.isVisible = true



    //              Configuraçao botao

    cadastra.setSize(50,30)
    cadastra.isVisible

    //              Adicionar botoes e textos ao painel

    painel.add(textEntryName)
    painel.add(textEntryCPF)
    painel.add(textEntContact)
    painel.add(textEntryEnd)


    painel.add(textName)
    painel.add(textCPF)
    painel.add(textAdress)
    painel.add(textContact)

    painel.add(cadastra, BorderLayout.AFTER_LAST_LINE)

    cadastra.addActionListener {

        var student = Student()

        student.name = textEntryName.text
        student.CPF = textEntryCPF.text
        student.address = textEntryEnd.text
        student.contact = textEntContact.text

        var calendar = Calendar.getInstance()
        var year : String = (calendar.get(Calendar.YEAR).toString())
        var month : String = ((calendar.get(Calendar.MONTH).toInt()) + 1).toString()

        student.matricula = (year + month +"0" + (StudentList.size + 1))

        val current = LocalDateTime.now()

        val formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME

        student.born =  current.format(formatter)


        if (student.name.isNullOrEmpty()) {
            JOptionPane.showMessageDialog( null, "Campo nome incompleto!")
        }else if ( student.CPF.isNullOrEmpty()){
            JOptionPane.showMessageDialog( null, "Campo CPF incompleto!")
        }else if (student.contact.isNullOrEmpty()){
            JOptionPane.showMessageDialog( null, "Campo contato incompleto!")
        }else if (student.address.isNullOrEmpty()){
            JOptionPane.showMessageDialog( null, "Campo endereço incompleto!")
        } else {
            StudentList.add(student)
            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!")
            painel.dispose()
        }
    }
    return StudentList


    return StudentList
}