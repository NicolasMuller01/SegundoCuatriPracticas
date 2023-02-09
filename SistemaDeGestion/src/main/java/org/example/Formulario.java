package org.example;

import Objetos.Clientes;
import baseDeDatos.Conexion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Formulario extends JFrame {
    private JButton btnSend;
    private JTextField textFieldPhone;
    private JTextField textFieldName;
    private JLabel lbName;
    private JLabel lbPhone;
    private JPanel main;
    private JButton BtnSearch;
    private JLabel id;

    private JTextField textFieldId;
    

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario");
        frame.setContentPane(new Formulario().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(400,400));
        frame.pack();
        frame.setVisible(true);

    }
    public Formulario(){
        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textFieldName.getText();
                Integer phone = Integer.parseInt(textFieldPhone.getText());
                Clientes cliente = new Clientes(name, phone);
                Conexion dao = new Conexion();
                dao.add(cliente);
            }
        });

        BtnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String driver = "com.mysql.jdbc.Driver";
                String link = "jdbc:mysql://localhost:3306/sistema";
                Connection conexion = null;
                try {
                    conexion = DriverManager.getConnection(link,"root","");
                    PreparedStatement pst = conexion.prepareStatement("select * from registro where id = ?");
                    pst.setString(1, textFieldId.getText());
                    ResultSet rs = pst.executeQuery();
                    if(rs.next()) {
                        textFieldName.setText(rs.getString("nombre"));
                        textFieldPhone.setText(rs.getString("telefono"));
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"no encontrado");
                    }
                }
                catch (Exception g){

                }
            }
        });
    }
}
