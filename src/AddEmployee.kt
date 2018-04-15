package br.edu.unifei.ecoi09.observer

import java.awt.BorderLayout
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import javax.swing.*


fun AddEmployee ( EmployeeList : ArrayList <Employee>) : ArrayList<Employee>{

    val widTxt = 300     //Largura campo de texto
    val heiTxt = 20     // altura campo de texto
    val xPosition = 80 // posicao x dos campos de texto

    val painel = JFrame("Adicionar Funcionário")
    painel.defaultCloseOperation = JFrame.DISPOSE_ON_CLOSE
    painel.setSize(420, 250)
    painel.isResizable = false
    painel.setLocationRelativeTo(null)
    painel.isVisible = true

    //declaração de objetos

    val textEntryName = JTextField()
    val textEntryCPF = JTextField ()
    val textEntContact = JTextField()
    val textEntryEnd = JTextField()
    val textEntrySetor = JTextField()
    val textEntryCargo = JTextField()

    val textName = JLabel("Nome :")
    val textCPF = JLabel ( "CPF :")
    val textContact = JLabel( " Telefone :")
    val textAdress = JLabel ("Endereço :")
    val textSetor = JLabel("Setor : ")
    val textCargo = JLabel("Cargo :")
    var cadastra = JButton( "Cadastrar")

    // Configuração de caixas de texto

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

    textEntrySetor.isVisible = true
    textEntrySetor.setSize(widTxt,heiTxt)
    textEntrySetor.setLocation(xPosition,130)

    textEntryCargo.isVisible = true
    textEntryCargo.setSize(widTxt,heiTxt)
    textEntryCargo.setLocation(xPosition,160)


    //Configuração Labels

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

    textSetor.setSize(50,40)
    textSetor.setLocation(xPositioLabel, 120)
    textSetor.isVisible = true

    textCargo.isVisible = true
    textCargo.setSize(50,40)
    textCargo.setLocation(xPositioLabel,150)

        // Configuraçao botao

    cadastra.setSize(50,30)
    cadastra.isVisible

      //              Adicionar botoes e textos ao painel

    painel.add(textEntryName)
    painel.add(textEntryCPF)
    painel.add(textEntContact)
    painel.add(textEntryEnd)
    painel.add(textEntrySetor)
    painel.add(textEntryCargo)

    painel.add(textName)
    painel.add(textCPF)
    painel.add(textAdress)
    painel.add(textCargo)
    painel.add(textContact)
    painel.add(textSetor)

    painel.add(cadastra, BorderLayout.AFTER_LAST_LINE)

    cadastra.addActionListener {

        var employee = Employee()

        employee.name = textEntryName.text
        employee.CPF = textEntryCPF.text
        employee.address = textEntryEnd.text
        employee.cargo = textEntryCargo.text
        employee.setor = textEntrySetor.text
        employee.contact = textEntContact.text

        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME
        employee.born =  current.format(formatter)

        if (employee.name.isNullOrEmpty()) {
            JOptionPane.showMessageDialog( null, "Campo nome incompleto!")
        }else if ( employee.CPF.isNullOrEmpty()){
            JOptionPane.showMessageDialog( null, "Campo CPF incompleto!")
        }else if (employee.contact.isNullOrEmpty()){
            JOptionPane.showMessageDialog( null, "Campo contato incompleto!")
        }else if (employee.address.isNullOrEmpty()){
            JOptionPane.showMessageDialog( null, "Campo endereço incompleto!")
        }else if (employee.setor.isNullOrEmpty()){
            JOptionPane.showMessageDialog( null, "Campo setor incompleto!")
        } else {

        EmployeeList.add(employee)

        JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!")
        painel.dispose()
        }
    }
    return EmployeeList
}