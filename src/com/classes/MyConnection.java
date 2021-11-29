package com.classes;

import java.io.*;
import java.sql.*;

import javax.swing.JOptionPane;

public class MyConnection {

    //LoginUI Login = new LoginUI();
    //String user = Login.getUser();
    //String password = Login.getPassword();
    public static Connection getConnection() {
        String User = "";
        String Password = "";
        String Port = "";
        try {
            File File2 = new File("CredencialesSQL.txt");
            if (!File2.exists()) {
                System.out.println("Archivo -CredencialesSQL.txt- no existe");
            }
            FileReader File = new FileReader(File2);
            BufferedReader Buffer = new BufferedReader(File);
            User = Buffer.readLine();
            Password = Buffer.readLine();
            Port = Buffer.readLine();
            File.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        /*
        //Conexion Remota
        String connectionUrl = "jdbc:mysql://sql3.freesqldatabase.com:3306/sql3452769";
        User = "sql3452769";
        Password = "3J6tDwDQ1S";
         */
        //Conexion Local
        String Server = "localhost:" + Port;
        String connectionUrl = "jdbc:sqlserver://"
                + Server + ";"
                + "database=bdFivani;"
                + "user=" + User + ";"
                + "password=" + Password + ";"
                + "loginTimeout=0;";
        try {
            Connection cn = DriverManager.getConnection(connectionUrl);
            return cn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
