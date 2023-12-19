package com.classes;

import java.io.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class MyConnection {

    public static Connection getConnection() {
        String user = "";
        String password = "";
        String server = "";
        String db = "";
        try {
            File File2 = new File("CredencialesSQL.txt");
            if (!File2.exists()) {
                JOptionPane.showMessageDialog(null,"Archivo 'CredencialesSQL.txt' no existe");
            } else{
                FileReader File = new FileReader(File2);
                BufferedReader Buffer = new BufferedReader(File);
                server = Buffer.readLine();
                db = "bdPDV";
                user = Buffer.readLine();
                password = Buffer.readLine();
                File.close();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        String connectionUrl = "jdbc:sqlserver://"
                + server + ";"
                + "database="+ db + ";"
                + "user=" + user + ";"
                + "password=" + password + ";"
                + "loginTimeout=0;";
        try {
            return DriverManager.getConnection(connectionUrl);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de Conexion");
            return null;
        }
    }
}
