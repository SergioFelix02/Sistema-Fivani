package com.classes;

import java.io.*;
import java.sql.*;

import javax.swing.JOptionPane;

public class MyConnection {

    public static Connection getConnection() {
        String User = "";
        String Password = "";
        String  Server = "";
        try {
            File File2 = new File("CredencialesSQL.txt");
            if (!File2.exists()) {
                System.out.println("Archivo -CredencialesSQL.txt- no existe");
            }
            FileReader File = new FileReader(File2);
            BufferedReader Buffer = new BufferedReader(File);
            Server = Buffer.readLine();
            User = Buffer.readLine();
            Password = Buffer.readLine();
            File.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        String connectionUrl = "jdbc:sqlserver://"
                + Server + ";"
                + "database=bdPuntoVenta;"
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
